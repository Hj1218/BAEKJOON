const fs = require("fs");  //입력을 받아 처리하는 FileSystem 모듈 불러오기
const input = fs.readFileSync("/dev/stdin").toString().split("\n");
const a = input[0].split(" ");
const n = Number(a[0]);
const q = Number(a[1]);
const b = input[1].split(" ");
let arr = [];
for(let i=0;i<n;i++){
  arr.push(Number(b[i]));
}
const c = input[2].split(" ");
let arr2 = [];
for(let i=0;i<q;i++){
  arr2.push(Number(c[i]-1));
}
let num = [];
let s = 0;
for(let i=0;i<arr.length;i++){
  let temp = arr[i];
  if(i+1>=n){
    temp *= arr[(i+1)%n];
  }
  else{
    temp *= arr[i+1];
  }
  if(i+2>=n){
    temp *= arr[(i+2)%n];
  }
  else{
    temp *= arr[i+2];
  }
  if(i+3>=n){
    temp *= arr[(i+3)%n];
  }
  else{
    temp *= arr[i+3];
  }
  num.push(temp);
  s+=temp;
}
let result = [];
for(let i=0;i<arr2.length;i++){
  for(let j=0;j<4;j++){
    if(arr2[i]-j<0){
      num[n+arr2[i]-j] *= -1;
      s+=2*num[n+arr2[i]-j];
    }
    else{
      num[arr2[i]-j] *=-1;
      s+=2*num[arr2[i]-j];
    }
  }
  result.push(s);
}
console.log(result.join("\n"));