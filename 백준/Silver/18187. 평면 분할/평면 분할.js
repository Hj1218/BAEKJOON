const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim();
var n = Number(input);
var num = [];
num[1]=2;
num[2]=4;
var count = 3;
for(let i =3;i<=n;i++){
  num[i]=num[i-1]+count;
  if(i%3!=0){
    count++;
  }
}
console.log(num[n]);