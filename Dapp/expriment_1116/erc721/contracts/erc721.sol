// SPDX-License-Identifier: MIT
pragma solidity ^0.8.16;

contract XiongLingXin{
    // Token名称
    string public name;
    // Token代号
    string public symbol;
    // tokenId 到 owner address 的持有人映射
    mapping(uint => address) private Owners;
    // address 到 持仓数量 的持仓量映射
    mapping(address => uint) private Balances;
    // tokenID 到 授权地址 的授权映射
    mapping(uint => address) private TokenApprovals;
    //  owner地址。到operator地址 的批量授权映射
    mapping(address => mapping(address => bool)) private OperatorApprovals;

    event Transfer(address indexed _from, address indexed _to, uint256 indexed _tokenId);
    event Approval(address indexed _owner, address indexed _approved, uint256 indexed _tokenId);
    event ApprovalForAll(address indexed _owner, address indexed _operator, bool _approved);

    address private judgeOwner;
    // 控制只有owner才能访问
    modifier onlyOwner() {
        require(msg.sender == judgeOwner, "Only contract owner can call this function");
        _;

    }
    /**
     * 构造函数，初始化`name` 和`symbol` .
     */
    constructor(string memory name_, string memory symbol_) {
        name = name_;
        symbol = symbol_;
        judgeOwner = msg.sender;
    }
    
    // balanceOf，利用_balances变量查询owner地址的balance。
    function balanceOf(address _owner) external view returns (uint256) {
        require(_owner != address(0), "owner = zero address");
        return Balances[_owner];
    }

    // ownerOf，利用_owners变量查询tokenId的owner。
    function ownerOf(uint _tokenId) public view returns (address owner) {
        owner = Owners[_tokenId];
        require(owner != address(0), "token doesn't exist");
    }

    // isApprovedForAll，利用_operatorApprovals变量查询owner地址是否将所持NFT批量授权给了operator地址。
    function isApprovedForAll(address _owner, address _operator)
        external
        view
        returns (bool)
    {
        return OperatorApprovals[_owner][_operator];
    }

    // setApprovalForAll，将持有代币全部授权给operator地址。调用_setApprovalForAll函数。
    function setApprovalForAll(address operator, bool approved) external {
        OperatorApprovals[msg.sender][operator] = approved;
        emit ApprovalForAll(msg.sender, operator, approved);
    }

    // getApproved，利用_tokenApprovals变量查询tokenId的授权地址。
    function getApproved(uint _tokenId) external view returns (address) {
        require(Owners[_tokenId] != address(0), "token doesn't exist");
        return TokenApprovals[_tokenId];
    }
     
    // 授权函数。通过调整_tokenApprovals来，授权 to 地址操作 tokenId，同时释放Approval事件。
    function _approve(
        address _owner,
        address _to,
        uint _tokenId
    ) private {
        TokenApprovals[_tokenId] = _to;
        emit Approval(_owner, _to, _tokenId);
    }

    // approve，将tokenId授权给 to 地址。条件：to不是owner，且msg.sender是owner或授权地址。调用_approve函数。
    function approve(address _to, uint _tokenId) external {
        address owner = Owners[_tokenId];
        require(
            msg.sender == owner || OperatorApprovals[owner][msg.sender],
            "not owner nor approved for all"
        );
        _approve(owner, _to, _tokenId);
    }

    // 查询 spender地址是否可以使用tokenId（他是owner或被授权地址）。
    function _isApprovedOrOwner(
        address owner,
        address spender,
        uint tokenId
    ) private view returns (bool) {
        return (spender == owner ||
            TokenApprovals[tokenId] == spender ||
            OperatorApprovals[owner][spender]);
    }

    /*
     * 转账函数。通过调整_balances和_owner变量将 tokenId 从 from 转账给 to，同时释放Transfer事件。
     * 条件:
     * 1. tokenId 被 from 拥有
     * 2. to 不是0地址
     */
    function _transfer(
        address owner,
        address from,
        address to,
        uint tokenId
    ) private {
        require(from == owner, "not owner");
        require(to != address(0), "transfer to the zero address");

        _approve(owner, address(0), tokenId);

        Balances[from] -= 1;
        Balances[to] += 1;
        Owners[tokenId] = to;

        emit Transfer(from, to, tokenId);
    }
    
    // 实现IERC721的transferFrom，非安全转账，不建议使用。调用_transfer函数
    function transferFrom(
        address from,
        address to,
        uint tokenId
    ) external {
        address owner = ownerOf(tokenId);
        require(
            _isApprovedOrOwner(owner, msg.sender, tokenId),
            "not owner nor approved"
        );
        _transfer(owner, from, to, tokenId);
    }

    /**
     * 安全转账，安全地将 tokenId 代币从 from 转移到 to，会检查合约接收者是否了解 ERC721 协议，以防止代币被永久锁定。调用了_transfer函数和_checkOnERC721Received函数。条件：
     * from 不能是0地址.
     * to 不能是0地址.
     * tokenId 代币必须存在，并且被 from拥有.
     */
    function _safeTransfer(
        address _owner,
        address _from,
        address _to,
        uint _tokenId,
        bytes memory _data
    ) private {
        _transfer(_owner, _from, _to, _tokenId);
        
    }

    /**
     * safeTransferFrom，安全转账，调用了_safeTransfer函数。
     */
    function safeTransferFrom(
        address from,
        address to,
        uint tokenId,
        bytes memory _data
    ) public {
        address owner = ownerOf(tokenId);
        require(
            _isApprovedOrOwner(owner, msg.sender, tokenId),
            "not owner nor approved"
        );
        _safeTransfer(owner, from, to, tokenId, _data);
    }

    // safeTransferFrom
    function safeTransferFrom(
        address from,
        address to,
        uint tokenId
    ) external {
        safeTransferFrom(from, to, tokenId, "");
    }

    /** 
     * 铸造函数。通过调整_balances和_owners变量来铸造tokenId并转账给 to，同时释放Transfer事件。铸造函数。通过调整_balances和_owners变量来铸造tokenId并转账给 to，同时释放Transfer事件。
     * 这个mint函数只能让所有者调用
     * 条件:
     * 1. tokenId尚不存在。
     * 2. to不是0地址.
     */
    function _mint(address to, uint tokenId) external  virtual onlyOwner{
        require(to != address(0), "mint to zero address");
        require(Owners[tokenId] == address(0), "token already minted");

        Balances[to] += 1;
        Owners[tokenId] = to;

        emit Transfer(address(0), to, tokenId);
    }

    // 销毁函数，通过调整_balances和_owners变量来销毁tokenId，同时释放Transfer事件。条件：tokenId存在。
    function _burn(uint tokenId) internal virtual {
        address owner = ownerOf(tokenId);
        require(msg.sender == owner, "not owner of token");

        _approve(owner, address(0), tokenId);

        Balances[owner] -= 1;
        delete Owners[tokenId];

        emit Transfer(owner, address(0), tokenId);
    }

    
    /**
     * tokenURI函数，查询metadata。
     */
    function tokenURI(uint256 _tokenId) public view virtual returns (string memory) {
        require(Owners[_tokenId] != address(0), "Token Not Exist");

        string memory baseURI = _baseURI();
        return bytes(baseURI).length > 0 ? string(abi.encodePacked(baseURI, uintToString(_tokenId))) : "";
    }

    /**
     * 计算{tokenURI}的BaseURI，tokenURI就是把baseURI和tokenId拼接在一起，需要开发重写。
     * BAYC的baseURI为ipfs://QmeSjSinHpPnmXmspMjwiXyN6zS4E9zccariGR3jxcaWtq/ 
     */
    function _baseURI() internal view virtual returns (string memory) {
        return "";
    }

    /**
    * toString(uint256)函数，将uint转化为String
    */
    function uintToString(uint256 value) internal pure returns (string memory) {
        if (value == 0) {
            return "0";
        }
        uint256 temp = value;
        uint256 digits;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        bytes memory buffer = new bytes(digits);
        while (value != 0) {
            digits -= 1;
            buffer[digits] = bytes1(uint8(48 + (value % 10)));
            value /= 10;
        }
        return string(buffer);
    }
}