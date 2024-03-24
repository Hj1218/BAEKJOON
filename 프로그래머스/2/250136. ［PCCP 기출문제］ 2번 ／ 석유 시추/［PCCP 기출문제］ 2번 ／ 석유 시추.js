function solution(land) {
    const n = land.length; //세로
    const m = land[0].length; //가로
    const dx = [-1, 1, 0, 0];
    const dy = [0, 0, -1, 1]; 
    let queue = [[0, 0]];
    let oil = new Map();
    
    for(let i=0;i<m;i++){
        for(let j=0;j<n;j++){
            let index = new Set()//석유 얻을 수 있는 열 
            let count = 0; //석유 카운트 
            if(land[j][i]==1){ //석유가 있다면
                queue=[[j,i]]; //큐에 넣어줌
                while(queue.length>0){
                    let [y,x] = queue.shift();
                    if(land[y][x]==1){
                        land[y][x] = 0;
                        count ++;
                        if(!index.has(x)){
                            index.add(x);
                        }
                        for(let k=0;k<4;k++){
                            let ny = y + dy[k];
                            let nx = x + dx[k];
                            if(nx >= 0 && ny>=0 && nx<m && ny<n && land[ny][nx]==1){
                                queue.push([ny,nx]);
                            }
                        }
                    }
                }
            }
            if(count != 0){
                for(let idx of index){
                    oil.set(idx,oil.has(idx)?oil.get(idx)+count : count);
                }
            }
        }
    }
    let answer = Math.max(...oil.values());
    return answer;
}