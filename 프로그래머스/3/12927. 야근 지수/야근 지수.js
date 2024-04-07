function solution(n, works) {
    let total = works.reduce((acc, cur) => acc + cur, 0);
    if(total<=n){
        return 0;
    }
    while(n>0){
        let max = -1;
        let maxIndex = -1;
        
        for(let i = 0; i < works.length; i++) {
            if(works[i] > max) {
                max = works[i];
                maxIndex = i;
            }
        }
        
        works[maxIndex]--;
        n--; 
    }
    let sum = 0;
    for(let i=0;i<works.length;i++){
        sum += works[i]**2;
    }
    return sum;
}