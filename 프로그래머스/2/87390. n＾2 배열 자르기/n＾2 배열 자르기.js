function solution(n, left, right) {
    var answer = [];
    for(let i=left;i<=right;i++){
        let max = Math.max(Math.floor(i/n), i%n);
        answer.push(max+1);
    }
    return answer;
}