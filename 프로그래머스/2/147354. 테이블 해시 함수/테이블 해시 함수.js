function solution(data, col, row_begin, row_end) {
    var answer = 0;
    data.sort((a,b)=>{
       if(a[col-1]<b[col-1]){
           return -1;
       }else if(a[col-1]==b[col-1]){
           return b[0]-a[0];
       }
        else{
            return 1;
        }
    });
    
    for(let i=row_begin;i<=row_end;i++){
        let sum = 0;
        for(let j=0;j<data[i-1].length;j++){
            sum += data[i-1][j]%i;
        }
        answer ^= sum;
    }
    return answer;
}