function solution(cap, n, deliveries, pickups) {
    var answer = 0;
    let delSum = deliveries.reduce((a,b)=>a+b,0);
    let pickSum = pickups.reduce((a,b)=>a+b,0);
    while(true){
        if(delSum==0&&pickSum==0){
            break;
        }
        popItem(deliveries);
        popItem(pickups);
        let max = Math.max(deliveries.length, pickups.length);
        answer += max*2;
        delSum -= deleteItem(deliveries, cap);
        pickSum -= deleteItem(pickups, cap);
    }
    return answer;
}
const popItem = (arr) => {
    for(let i = arr.length-1;i>=0;i--){
        if(arr[i]==0){
            arr.pop();
        }
        else{
            return;
        }
    }
}
const deleteItem=(arr, cap) => {
    let count = 0;
    for(let i=arr.length-1;i>=0;i--){
        if(arr[i]>= cap){
            arr[i] -= cap;
            count += cap;
            break;
        }
        else {
            cap -= arr[i];
            count += arr[i];
            arr[i] = 0;
        }
    }
    return count;
}