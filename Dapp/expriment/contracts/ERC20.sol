// SPDX-License-Identifier: MIT

pragma solidity ^0.8.4;

import "./IERC20.sol";

contract ERC20 is IERC20 {

    mapping(address => uint256) public override balanceOf;

    mapping(address => mapping(address => uint256)) public override allowance;

    uint256 public override totalSupply;   // 代币总供给
    // name : xionglingxin  symbol : XiongLingXin
    string public name;   // 名称
    string public symbol;  // 符号
    
    uint8 public decimals = 18; // 小数位数

    // @dev 在合约部署的时候实现合约名称和符号
    constructor(string memory _name, string memory _symbol){
        name = _name;
        symbol = _symbol;
    }

    // @dev 实现`balanceOf`函数，查询账户的代币余额
    function getBalance(address account) external view returns (uint256){
        require(account != address(0), "ERC20: balance query for the zero address");
        return balanceOf[account];
    }

    // @dev 实现`getAllowance`函数，查询代理账户的代币余额
    function getAllowance(address owner, address spender) external view returns (uint256){
        require(owner != address(0), "ERC20: allowance query for the zero address");
        require(spender != address(0), "ERC20: allowance query for the zero address");
        return allowance[owner][spender];
    }
    // @dev 实现`getTotalSupply`函数，查询代币的总供给量
    function getTotalSupply() external view returns (uint256){
        return totalSupply;
    }
    // @dev 实现`transfer`函数，代币转账逻辑
    function transfer(address recipient, uint amount) external override returns (bool) {
        balanceOf[msg.sender] -= amount;
        balanceOf[recipient] += amount;
        emit Transfer(msg.sender, recipient, amount);
        return true;
    }

    // @dev 实现 `approve` 函数, 代币授权逻辑
    function approve(address spender, uint amount) external override returns (bool) {
        allowance[msg.sender][spender] = amount;
        emit Approval(msg.sender, spender, amount);
        return true;
    }

    // @dev 实现`transferFrom`函数，代币授权转账逻辑
    function transferFrom(
        address sender,
        address recipient,
        uint amount
    ) external override returns (bool) {
        allowance[sender][msg.sender] -= amount;
        balanceOf[sender] -= amount;
        balanceOf[recipient] += amount;
        emit Transfer(sender, recipient, amount);
        return true;
    }

    // @dev 铸造代币，从 `0` 地址转账给 调用者地址
    function mint(uint amount) external {
        balanceOf[msg.sender] += amount;
        totalSupply += amount;
        emit Transfer(address(0), msg.sender, amount);
    }

    // @dev 销毁代币，从 调用者地址 转账给  `0` 地址
    function burn(uint amount) external {
        balanceOf[msg.sender] -= amount;
        totalSupply -= amount;
        emit Transfer(msg.sender, address(0), amount);
    }
}

