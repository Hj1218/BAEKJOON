function solution(operations) {
    var answer = [];
    for(let i=0;i<operations.length;i++){
        let op = operations[i].split(" ");
        if(op[0]=="I"){
            answer.push(Number(op[1]));
        }
        else{
            if(op[1]=="1"){
                let index = answer.indexOf(Math.max(...answer));
                answer.splice(index,1);
            }else{
                let index = answer.indexOf(Math.min(...answer));
                answer.splice(index,1);
            }
        }
    }
    if(answer.length!=0){
        return [Math.max(...answer),Math.min(...answer)];
    }
    else{
        return [0,0];
    }
}