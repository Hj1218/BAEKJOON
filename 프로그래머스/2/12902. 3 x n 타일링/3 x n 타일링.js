function solution(n) {
    var answer = [0,0,3,0];
    if(n%2!=0){
        return 0;
    }
    for(let i=4;i<=n;i++){
        answer[i] = answer[i-2]*3 + 2;
        for(let j=i-4;j>0;j-=2){
            answer[i]+=answer[j]*2;
        }
        answer[i]%=1000000007;
    }
    return answer[n];
}