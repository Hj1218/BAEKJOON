function solution(k, ranges) {
    var answer = [];
    
    let arr = [k];
    while(k!==1){
        if(k%2==0){
            k = k/2;
        }
        else{
            k = k*3 +1;
        }
        arr.push(k);
    }
    
    let size = [];
    for(let i=0;i<arr.length-1;i++){
        size.push((arr[i]+arr[i+1])/2);
    }
    
    let num = size.length;
    for(let i=0;i<ranges.length;i++){
        let sum = 0;
        if(ranges[i][0] > num + ranges[i][1]){
            sum = -1;
        }
        else{
            for(let j=ranges[i][0];j<num+ranges[i][1];j++){
                sum += size[j];
            }
        }
        answer.push(sum);
    }    
    return answer;
}