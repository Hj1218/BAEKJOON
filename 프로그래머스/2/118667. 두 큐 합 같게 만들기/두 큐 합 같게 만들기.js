function solution(queue1, queue2) {
    let num = 0;
    let sum1 = 0;
    let q = [...queue1,...queue2];
    
    queue1.forEach((a)=>{
       sum1 += a; 
    });
    q.forEach((b)=>{
       num += b; 
    });
    
    num /= 2;
    
    let left = 0;
    let right = queue1.length;
    let count = 0;
    
    for(let i=0;i<q.length+queue1.length;i++){
        if(sum1>num){
            sum1 -= q[left];
            if(left<q.length-1){
                left++;
            }
            else{
                left = 0;
            }
            count++;
        }
        else if(sum1<num){
            sum1 += q[right];
            if(right<q.length-1){
                right++;
            }
            else{
                right = 0;
            }
            count++;
        }
        else{
            return count;
        }
    }
    
    return -1;
}