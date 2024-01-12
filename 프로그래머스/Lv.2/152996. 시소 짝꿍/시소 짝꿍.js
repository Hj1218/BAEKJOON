function solution(weights) {
    var answer = 0;
    const n = [1/2,2/3,3/4];
    let map = new Map();
    for(let i=0;i<weights.length;i++){
        if(map.get(weights[i])!=undefined){
            map.set(weights[i],map.get(weights[i])+1);
        }
        else{
            map.set(weights[i],1);
        }
    }
    for(let a of map.keys()){
        answer += map.get(a)*(map.get(a)-1)/2;
    }
    const arr = [...new Set(weights)];
    for(let j=0;j<arr.length;j++){
        for(let k=0;k<n.length;k++){
            if(arr.includes(arr[j]*n[k])){
                answer += map.get(arr[j])*map.get(arr[j]*n[k]);
            }
        }
    }
    return answer;
}