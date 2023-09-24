const fs = require("fs");  //입력을 받아 처리하는 FileSystem 모듈 불러오기
const input = fs.readFileSync("/dev/stdin").toString().split("\n");
let n = Number(input[0]);
const result = [];
for(let i=1;i<=n;i++){
  const arr = input[i].split(" ");
  let a = Number(arr[0]);
  let b = Number(arr[1]);
  let num = 1;
  for(let j=0;j<b;j++){
    num = (num*a)%10;
  }
  if(num==0){
    result.push(10);
  }
  else{
    result.push(num);
  }
}
console.log(result.join("\n"));