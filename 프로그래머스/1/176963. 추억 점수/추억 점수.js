function solution(name, yearning, photo) {
    var answer = [];
    for(let i=0;i<photo.length;i++){
        let sum = 0;
        for(let k=0;k<photo[i].length;k++){
            for(let j=0;j<name.length;j++){
            if(name[j]==photo[i][k]){
                sum+=yearning[j];
            }
        }
        }
        answer.push(sum);
    }
    return answer;
}