function solution(topping) {
    let count = 0;
    let t1 = new Map();
    let t2 = new Map();
    for(let i=0;i<topping.length;i++){ //토핑마다 개수 구함 
        if(t1.has(topping[i])){ //이미 있는 토핑인 경우
            t1.set(topping[i],t1.get(topping[i])+1);
        }
        else{ //없는 토핑인 경우
            t1.set(topping[i],1);
        }
    }
    for(let i=0;i<topping.length;i++){ //t1은 제거, t2는 추가하면서 비교
        //t1
        if(t1.get(topping[i])!=1){
            t1.set(topping[i],t1.get(topping[i])-1);
        }
        else{
            t1.delete(topping[i]);
        }
        //t2
        if(t2.has(topping[i])){
            t2.set(topping[i],t2.get(topping[i])+1);
        }
        else{
            t2.set(topping[i],1);
        }
        //비교
        if(t1.size==t2.size){
            count++;
        }
    }
    return count;
}