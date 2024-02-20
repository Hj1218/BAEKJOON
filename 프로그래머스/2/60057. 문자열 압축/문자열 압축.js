function solution(s) {
    let min = s.length; //최소길이
    for(let i=1;i<=s.length/2;i++){
        let count = 1; //반복횟수
        let slice = s.slice(0,i); //i개 단위
        let str = ""; //압축된 문자열
        for(let j=i;j<s.length;j+=i){ //나머지 문자열 단위별 탐색
            if(s.slice(j,j+i)==slice){ //단위로 자른 문자열과 같은 경우
                count++; //카운트 증가
            }
            else{ //같지 않은 경우
                if(count!=1){
                    str += count; //반복횟수
                    str += slice; //단위 문자열 
                }
                else{
                    str += slice; //단위 문자열 
                }
                slice = s.slice(j,j+i); //단위 문자열 바꿔줌 
                count = 1; //반복 횟수 초기화 
            }
        }
        if(count!=1){
            str += count; //반복횟수
            str += slice; //단위 문자열 
        }
        else{
            str += slice; //단위 문자열 
        }
        min = Math.min(min,str.length); //문자열의 최소 길이
    }
    return min;
}