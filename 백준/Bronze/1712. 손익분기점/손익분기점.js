const fs = require("fs");  //입력을 받아 처리하는 FileSystem 모듈 불러오기
const input = fs.readFileSync("/dev/stdin").toString().split(" ");
const a = Number(input[0]);
const b = Number(input[1]);
const c = Number(input[2]);
const margin = c-b;
const count = Math.floor(a/margin)+1;
if(margin<=0){
  console.log(-1);
}
else{
  console.log(count);
}