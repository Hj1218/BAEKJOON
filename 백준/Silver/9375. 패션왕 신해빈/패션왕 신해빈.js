const fs = require("fs");  //입력을 받아 처리하는 FileSystem 모듈 불러오기
const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받기
const k = Number(input[0]); //테스트 케이스 개수
var n = 1;
for(let i=0;i<k;i++){ //테스트 케이스 개수만큼 반복
  const num = Number(input[n]);
  let map = new Map();
  const clothes = [];
  for(let j=1+n;j<1+n+num;j++){
    clothes.push(input[j].split(" "));
  }
  for(let l=0;l<num;l++){
    if(map.has(clothes[l][1])){
      map.set(clothes[l][1],map.get(clothes[l][1])+1);
    }
    else{
      map.set(clothes[l][1],1);
    }
  }
  n+=num+1;
  var result = 1;
  for(let value of map.values()){
    result *= (value+1);
  }
  console.log(result-1);
}