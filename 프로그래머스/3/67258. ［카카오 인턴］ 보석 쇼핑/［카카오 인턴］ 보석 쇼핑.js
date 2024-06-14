function solution(gems) {
    var answer = [];
    const size = new Set(gems).size;
    const map = new Map();
    let min = 100000;
    
    gems.forEach((gem,i)=>{
        map.delete(gem)
        map.set(gem,i)
        if(map.size===size){
            let j = map.values().next().value;
            if(min > i-j){
                min = i - j
                answer = [j+1,i+1];
            }
        }
    });
    return answer;
}