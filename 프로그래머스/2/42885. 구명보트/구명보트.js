function solution(people, limit) {
    var answer = 0;
    people.sort((a,b)=>a-b); //오름차순 정렬 
    while(people.length>0){
        let a = people.pop();
        if(a + people[0] <= limit){ //최대 + 최소 <= 제한
            people.shift(); //배열에서 최소 제거함 
        }
        answer++;
    }
    return answer;
}