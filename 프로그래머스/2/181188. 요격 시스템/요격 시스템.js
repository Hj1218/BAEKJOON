function solution(targets) {
    var answer = 0;
    let end = 0;
    targets.sort((a, b) => a[1] - b[1]); //개구간(s,e) e 기준 오름차순 정렬
    for(let i=0;i<targets.length;i++){
        if(end<=targets[i][0]){ //개구간 시작좌표 s가 end보다 크거나 같은 경우 
            answer++; //카운트 증가
            end = targets[i][1]; //end = 개구간 끝좌표 e
        }
    }
    return answer;
}