import { ethers, JsonRpcProvider } from "ethers";
import fs from 'fs';

export async function mint(to,uri){
    console.log('to', to)
    const provider = new JsonRpcProvider("http://localhost:8545");
    const signer = await provider.getSigner();
    const contractAddress = "0x9fE46736679d2D9a65F0992F2272dE9f3c7fa6e0";
    const abi = JSON.parse(fs.readFileSync("./abis/MyNFT.json"));
    const contract = new ethers.Contract(contractAddress,abi,signer);
    const result = await contract.safeMint(to,uri);
    console.log(result.hash);

}
// 0x5FC8d32690cc91D4c39d9d3abcBD16989F875707

// mint('0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266','http://sample')