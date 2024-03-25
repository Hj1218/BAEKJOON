function solution(record) {
    var answer = [];
    let result = [];
    let map = new Map();
    for(let i=0;i<record.length;i++){
        let [state, user, name] = record[i].split(" ");
        if(state=="Enter"){
            map.set(user, name);
            answer.push([user,"님이 들어왔습니다."]);
        }
        else if(state=="Leave"){
            answer.push([user,"님이 나갔습니다."]);
        }
        else if(state=="Change"){
            map.set(user, name);
        }
    }
    for(let i=0;i<answer.length;i++){
        result.push(map.get(answer[i][0])+answer[i][1]);
    }
    return result;
}