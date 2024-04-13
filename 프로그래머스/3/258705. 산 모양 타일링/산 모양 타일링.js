function solution(n, tops) {
    let dp1 = new Array(n+1).fill(0);
    let dp2 = new Array(n+1).fill(0);
    
    dp1[1] = 1;
    dp2[1] = tops[0]==1?3:2;
    
    for(let i=2;i<=n;i++){
        if(tops[i-1]==0){
            dp1[i] = (dp1[i-1]+dp2[i-1])%10007;
            dp2[i] = (dp1[i-1] + 2*dp2[i-1])%10007;
        }
        else{
            dp1[i] = (dp1[i-1]+dp2[i-1])%10007;
            dp2[i] = (2*dp1[i-1] + 3*dp2[i-1])%10007;
        }
    }
    
    return (dp1[n]+dp2[n])%10007;
}