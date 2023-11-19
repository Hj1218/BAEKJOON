function solution(brown, yellow) {
    let sum = brown + yellow;
    for(let i=3;i<=sum;i++){
        if(sum%i==0&&sum/i>=3){
            let a = Math.max(i,sum/i);
            let b = Math.min(i,sum/i);
            if((a-2)*(b-2)==yellow){
                return [a,b];
            }
        }
    }
}