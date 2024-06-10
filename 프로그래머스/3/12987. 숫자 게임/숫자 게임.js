function solution(A, B) {
    var answer = 0;
    A.sort((a,b) => b-a);
    B.sort((a,b) => b-a);
    let index = 0;
    for(let i=0; i<A.length; i++){
        if(A[i]<B[index]){
            answer ++;
            index ++;
        }
    }
    return answer;
}