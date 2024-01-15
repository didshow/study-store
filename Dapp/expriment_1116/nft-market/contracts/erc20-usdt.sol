// contracts/GLDToken.sol
// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

import {ERC20} from "@openzeppelin/contracts/token/ERC20/ERC20.sol";

contract GLDToken is ERC20 {
    constructor() ERC20("Fake USDT", "cUSDT") {
        _mint(msg.sender, 1 * 10 ** 8 * 10 ** 18);
    }
}