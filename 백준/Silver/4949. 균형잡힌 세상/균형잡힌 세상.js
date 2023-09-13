const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");
const ans = [];
for(let s of input){
  const stack = [];
  let check = true;
  if(s=="."){
    break;
  }
  for(let i=0;i<s.length;i++){
    if(s[i]=="["||s[i]=="("){
      stack.push(s[i]);
    }
    else if(s[i]=="]"){
      if(stack[stack.length-1]=="["){
        stack.pop();
      }
      else{
        check = false;
        break;
      }
    }
    else if(s[i]==")"){
      if(stack[stack.length-1]=="("){
        stack.pop();
      }
      else{
        check = false;
        break;
      }
    }
    else if(s[i]=="."){
      break;
    }
  }
  if(check==true&&stack.length==0){
    ans.push("yes");
  }
  else if(check==false||stack.length>0){
    ans.push("no");
  }
}
console.log(ans.join("\n"));