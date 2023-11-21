function solution(N, stages) {
    const getNum = (arr, el)=>arr.filter(v=> v===el).length;
    const num = [];
    for(let i=0;i<N;i++){
        num[i]=getNum(stages,i+1);
    }
    let len = stages.length;
    let fal = [];
    let a,f;
    for(let i=0;i<N;i++){
        a = i+1;
        len = len-num[i];
        f = num[i]/len;
        fal.push([a,f]);
    }
    fal.sort((b,c)=>{
        if(b[1]==c[1]){
            return b[0]>c[0]?1:-1;
        }else if(b[1]>c[1]){
            return -1;
        }
        else{
            return 1;
        }
    })
    let answer = [];
    for(let i=0;i<N;i++){
        answer[i] = fal[i][0];
    }
    return answer;
}