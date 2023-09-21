const fs = require("fs");  //입력을 받아 처리하는 FileSystem 모듈 불러오기
const input = fs.readFileSync("/dev/stdin").toString(); //한 줄 입력받기
let n = Number(input); 
const num = new Array(n).fill(0);
num[1]=1;
num[2]=2;
num[3]=3;
for(let i=4;i<=n;i++){
  num[i] = (num[i-1]+num[i-2])%15746;
}
console.log(num[n]);