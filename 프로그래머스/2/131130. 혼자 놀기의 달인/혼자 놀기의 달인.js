function solution(cards) {
    let max = 0;
    for(let i=0;i<cards.length;i++){
        let check = Array(cards.length).fill(false);
        let box1 = 0;
        let index = i;
        while(!check[index]){
            check[index] = true;
            index = cards[index]-1;
            box1++;
        }
        for(let j=0;j<cards.length;j++){
            if(check[j]){
                continue;
            }
            let box2 = 0;
            let index = j;
            while(!check[index]){
                check[index] = true;
                index = cards[index]-1;
                box2++;
            }
            max = Math.max(max, box1*box2);
        }
    }
    return max;
}