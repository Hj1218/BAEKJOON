const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim();
let n = Number(input);
let result = Array(n+1).fill(0);
result[2] = 1;
result[3] = 1;
for(let i=4; i<=n; i++){
  result[i] = result[i-1]+1;
  if(i%3==0){
    result[i] = Math.min(result[i], result[i/3]+1);
  }
  if(i%2==0){
    result[i] = Math.min(result[i], result[i/2]+1);
  }
}
console.log(result[n]);