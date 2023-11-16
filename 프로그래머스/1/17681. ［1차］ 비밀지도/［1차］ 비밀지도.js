function solution(n, arr1, arr2) {
    let answer = [];
    let c;
    for(let i=0;i<n;i++){
        let a = arr1[i].toString(2);
        let b = arr2[i].toString(2);
        a= '0'.repeat(n-a.length)+a;
        b= '0'.repeat(n-b.length)+b;
        c='';
        for(let j=0;j<n;j++){
            if(a[j]==0&&b[j]==0){
                c+=" ";
            }
            else{
                c+="#";
            }
        }
        answer.push(c);
    }
    return answer;
}