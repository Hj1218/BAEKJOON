function solution(fees, records) {
    let car = [];
    let answer = [];
    for(let r of records){
        let data = r.split(" ");
        let time = data[0].split(":");
        data[0] = 60*Number(time[0])+Number(time[1]);
        car.push(data);
    }
    car.sort((a,b)=>{
        if(a[1]==b[1]){
            return a[0]-b[0];
        }
        else{
            return a[1]-b[1];
        }
    })
    let start = 0;
    let end = 0;
    while(car.length){
        let current = car.shift();
        if(car.length&&car[0][1]===current[1]){
            if(current[2]==="IN"){
                start = current[0];
            }
            else{
                end += current[0]-start;
            }
        }
        else{
            if(current[2]==="IN"){
                end += 1439 - current[0];
            }
            else{
                end += current[0]-start;
            }
            if(end <= fees[0]){
            answer.push(fees[1]);
        }
        else{
            let cost = fees[1]+Math.ceil((end-fees[0])/fees[2])*fees[3];
            answer.push(cost);
        }
        end = 0;
        }
    }
    return answer;
}