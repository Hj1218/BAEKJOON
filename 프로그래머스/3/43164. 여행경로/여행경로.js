function solution(tickets) {
    var answer = [];
    tickets.sort();
    const result = [];
    const visited = Array(tickets.length).fill(false);
    function dfs(now, num){
        result.push(now);
        if(num==tickets.length){{
            answer = result;
            return true;
        }}
        for(let i=0;i<tickets.length;i++){
            if(!visited[i] && tickets[i][0] == now){
                visited[i] = true;
                if(dfs(tickets[i][1], num + 1)){
                    return true;
                }
                visited[i] = false;
            }
        }
        result.pop();
        return false;
    };
    dfs("ICN", 0);
    return answer;
}