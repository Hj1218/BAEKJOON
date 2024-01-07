function solution(s) {
    const left = ['[','(','{'];
    const right = [']',')','}'];
    let stack = [];
    let answer=0;
    let flag = true;
    for(let i=0;i<s.length;i++){
        let str = s.slice(i)+s.slice(0,i);
        flag = true;
        for(let a of str){
            if(left.includes(a)){
                stack.push(a);
            }
            else{
                let check = stack.pop();
                if(right.indexOf(a)==left.indexOf(check)){
                    continue;
                }
                flag = false;
                break;
            }
        }
        if(flag&&stack.length==0){
            answer++;
        }
    }
    return answer;
}