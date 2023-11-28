function solution(today, terms, privacies) {
    let t = today.split(".").map(Number);
    let answer = [];
    for(let i=0;i<privacies.length;i++){
        let p = privacies[i].split(" ");
        let pp = p[0].split(".").map(Number);
        let num;
        for(let j=0;j<terms.length;j++){
            let tj = terms[j].split(" ");
            if(p[1]==tj[0]){
                num = Number(tj[1]);
            }
        }
        let y,m,d;
        let n = Math.floor((pp[1]+num)/12);
        y = pp[0]+n;
        if((pp[1]+num)%12==0){
            m = 12;
            y -=1;
        }
        else{
            m = (pp[1]+num)%12;
        }
        if(pp[2]==1){
            d = 28;
            if(m==1){
                y -= 1;
                m = 12;
            }
            else{
                m -=1;     
            }
        }
        else{
            d = pp[2]-1;
        }
        if(t[0]==y){
           if(t[1]>m){
               answer.push(i+1);
           }
            else if(t[1]==m){
                if(t[2]>d){
                    answer.push(i+1);
                }
            }
        }
        else if(t[0]>y){
            answer.push(i+1);
        }
    }
        return answer;
}