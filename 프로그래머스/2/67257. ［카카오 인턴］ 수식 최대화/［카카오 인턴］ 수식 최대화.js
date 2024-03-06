function solution(expression) {
    let answer = [];
    const prior = [['+','*','-'],['+','-','*'],['*','+','-'],['*','-','+'],['-','*','+'],['-','+','*']];
    for(let i=0;i<prior.length;i++){
        let str = expression.split(/(\D)/);
        for(let j=0;j<3;j++){
            while(str.includes(prior[i][j])){
                let index = str.indexOf(prior[i][j]);
                let n1 = Number(str[index-1]);
                let n2 = Number(str[index+1]);
                let num = 0;
                if (prior[i][j] === '+') {
                    num = n1 + n2;
                } else if (prior[i][j] === '-') {
                    num = n1 - n2;
                } else if (prior[i][j] === '*') {
                    num = n1 * n2;
                }
                str.splice(index-1,3,num.toString());
            }
        }
        answer.push(Math.abs(Number(str[0])));
    }
    return Math.max(...answer);
}