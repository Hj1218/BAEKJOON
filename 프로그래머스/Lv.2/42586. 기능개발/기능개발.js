function solution(progresses, speeds) {
    var answer = [];
    let stack = [];
    for(let i=0;i<progresses.length;i++){
        let time = (100-progresses[i])%speeds[i]==0 ? (100-progresses[i])/speeds[i] : Math.floor((100-progresses[i])/speeds[i]) + 1;
        stack.push(time);
    }
    let count = 1;
    let t = stack.shift();
    for(let j=0;j<stack.length;){
        let s = stack.shift();
        if(s<=t){
            count++;
            continue;
        }
        answer.push(count);
        t = s;
        count = 1;
    }
    if(count!=0){
        answer.push(count);
    }
    return answer;
}