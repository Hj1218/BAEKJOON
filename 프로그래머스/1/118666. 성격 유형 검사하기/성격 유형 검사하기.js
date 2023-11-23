function solution(survey, choices) {
    let n = survey.length;
    let mbti = [['R',0],['T',0],['C',0],['F',0],['J',0],['M',0],['A',0],['N',0]];
    let score = [3,2,1,0,1,2,3];
    for(let i=0;i<n;i++){
        if(choices[i]>=4){
            for(let j=0;j<mbti.length;j++){
                if(survey[i][1]==mbti[j][0]){
                    mbti[j][1] += score[choices[i]-1];
                }
            }
        }
        else{
            for(let j=0;j<mbti.length;j++){
                if(survey[i][0]==mbti[j][0]){
                    mbti[j][1] += score[choices[i]-1];
                }
            }
        }
    }
    let s='';
    for(let i=0;i<8;i+=2){
        if(mbti[i][1]>=mbti[i+1][1]){
            s = s+mbti[i][0];
        }
        else{
            s = s+mbti[i+1][0];
        }
    }
    return s;
}