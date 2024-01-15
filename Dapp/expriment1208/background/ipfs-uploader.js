import { create } from 'kubo-rpc-client'
import fs from 'fs';

// connect to ipfs daemon API server
const ipfs = create('http://43.129.194.130:5001') 

export async function uploadFileToIPFS(filePath){
    const file = fs.readFileSync(filePath);
    const result = await ipfs.add({
        path: filePath,
        content: file});

        // console.log(result);
        return result;
}

// uploadFileToIPFS('files/WeChat.jpg')

export async function uploadJSONToIPFs(json){
    const result = await ipfs.add(
        JSON.stringify(json));
        // console.log(result);
        return result;
    
}

uploadJSONToIPFs({name:"test"});
