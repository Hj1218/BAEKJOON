function solution(book_time) {
    var answer = [];
    let time = [];
    for(let i=0;i<book_time.length;i++){
        let start = book_time[i][0].split(":");
        let end = book_time[i][1].split(":");
        time.push([Number(start[0]) * 60 + Number(start[1]),Number(end[0]) * 60 + Number(end[1])]);
    }
    time.sort((a,b)=>{
        if(a[0]==b[0]){
            return a[1]-b[1];
        }
        else{
            return a[0]-b[0];
        }
    });
    for(let i = 0; i < time.length; i++) {
        if(answer.length == 0) {
            answer.push(time[i][1]+10);
        } else {
            answer.sort((a, b) => a - b); //퇴실 시간이 빠른 순으로 정렬 
            let flag = false;
            for(let j = 0; j < answer.length; j++) {
                if(answer[j] <= time[i][0]) {
                    flag = true;
                    answer[j] = time[i][1]+10;
                    break;
                }
            }
            if(!flag) {
                answer.push(time[i][1]+10);
            }
        }
    }
    return answer.length;
}