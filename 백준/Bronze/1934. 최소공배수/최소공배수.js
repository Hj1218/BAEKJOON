const fs = require("fs");  //입력을 받아 처리하는 FileSystem 모듈 불러오기
const input = fs.readFileSync("/dev/stdin").toString().split("\n");
let n = Number(input[0]);
const result = [];
for(let i=1;i<=n;i++){
  const arr = input[i].split(" ");
  let arr1 = Number(arr[0]);
  let arr2 = Number(arr[1]);
  let num = arr1*arr2;
  while(arr1%arr2!=0){
    let a = arr1%arr2;
    if(a !=0){
      arr1 = arr2;
      arr2 = a;
    }
  }
  num /=arr2;
  result.push(num);
}
console.log(result.join("\n"));