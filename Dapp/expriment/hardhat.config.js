require("@nomiclabs/hardhat-ethers");

const privateKey = "93c3aa7c97de840724b5f71b821b9ae83b09b28f2a59c456b60dc1cb28cdac13";
const rpcUrl = "https://exchaintestrpc.okex.org";

module.exports = {
  defaultNetwork: "okex_testnet",
  networks: {
    okex_testnet: {
      url: rpcUrl,
      accounts: [privateKey],
    },
  },
  solidity: {
    version: "0.8.9",
    // settings: {
    //   compiler: {
    //     // 添加solidity-versions镜像源
    //     url: "https://solc-bin.ethereum.org",
    //   },
    // },
  },
};