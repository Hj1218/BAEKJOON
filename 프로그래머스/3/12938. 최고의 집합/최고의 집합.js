function solution(n, s) {
    let a = Math.floor(s/n);
    if(n>s){
        return [-1];
    }
    let answer = new Array(n).fill(a);
    for(let i=0;i<s%n;i++){
        answer[answer.length-1-i]++;
    }
    return answer;
}