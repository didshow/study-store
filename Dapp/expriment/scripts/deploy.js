
async function main() {
    const [deployer] = await ethers.getSigners();
   
    console.log("Deploying contracts with the account:", deployer.address);
   
    console.log("Account balance:", (await deployer.getBalance()).toString());
   
    const ERC20 = await ethers.getContractFactory("ERC20");
    const erc20 = await ERC20.deploy();
   
    console.log("ERC20 address:", erc20.address);

    const params = {
      param1: process.argv[4], // xionglingxin
      param2: process.argv[5], // XiongLingXin
    };
    
    console.log(params.param1); // 输出：xionglingxin
    console.log(params.param2); // 输出：XiongLingXin
  }
   
  main()
    .then(() => process.exit(0))
    .catch((error) => {
      console.error(error);
      process.exit(1);
    });