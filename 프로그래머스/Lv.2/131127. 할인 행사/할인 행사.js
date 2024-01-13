function solution(want, number, discount) {
    var answer = 0;
    let flag = true;
    for(let i=0;i<discount.length-9;i++){
        let arr = discount.slice(i,i+10);
        let num = [];
        for(let j=0;j<want.length;j++){
            let count = arr.filter(element => want[j]==element).length;
            num.push(count);
        }
        if(num.toString()==number.toString()){
            answer++;
        }
    }
    return answer;
}