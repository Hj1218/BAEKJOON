function solution(n, info) {
    var answer = new Array(11).fill(0);
    let max = 0; //가장 큰 점수 차이 
    const dfs=(index, count, score, peach, ryan)=>{ //인덱스, 화살수, 라이언 과녁, 어피치 점수, 라이언 점수  
        if(count>n){ //남은 화살이 없는 경우
            return;
        }
        if(index>10){ //(0~10)탐색이 끝난 경우
            let total = ryan - peach; //점수 차이
            if(max<total){
                score[10] = n - count; //남은 화살 0점으로 처리 
                max = total;
                answer = score;
            }
            return;
        }
        if(count<n){ //라이언이 점수를 얻는 경우 (화살이 남은 경우)
            let score2 = [...score]; //현재 라이언의 과녁 배열
            score2[10-index] = info[10-index]+1; //어피치보다 +1
            dfs(index+1,count+info[10-index]+1,score2,peach,ryan+index); //다음 인덱스, count+사용한 화살, 라이언 과녁, 어피치점수, 라이언 점수 + 얻은 점수 
        }
        if(info[10-index]>0){ //어피치가 점수를 얻은 경우 
            dfs(index+1, count, score, peach+index, ryan); //다음 인덱스, 화살 수, 라이언 과녁, 어피치 점수 + 얻은 점수, 라이언점수
        }
        else{ //모두 점수를 얻지 못한 경우 
            dfs(index+1,count,score,peach,ryan);
        }
    }
    dfs(0,0,answer,0,0);
    return max==0?[-1]:answer;
}