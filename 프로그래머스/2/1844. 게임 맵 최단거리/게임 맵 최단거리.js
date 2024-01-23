function solution(maps) {
    var answer = [[0,0,1]]; //row column count 
    
    let dx = [0, 1, 0, -1]; //동서남북으로 이동
    let dy = [1, 0, -1, 0];
    
    maps[0][0] = 0; //출발점 방문 여부 o
    
    while(answer.length){
        let [l, c, count] = answer.shift(); //현재 위치 
        for(let i=0;i<4;i++){ //동서남북으로 이동
            let ax = l + dx[i]; 
            let ay = c + dy[i];
            
            if(ax==maps.length-1&&ay==maps[0].length-1){ //적 팀 진영인 경우 
                count++;
                return count;
            }
            if(ax<maps.length&&ax>=0&&ay>=0&&ay<maps[0].length){ //게임 맵에 속하는 경우 
                if(maps[ax][ay]==1){ //해당 위치가 막힌 길이 아닌 경우 
                    maps[ax][ay] = 0; //방문 여부 o
                    answer.push([ax, ay, count+1]);
                }
            }
        }
    }
    return -1; //도달하지 못하는 경우 -1 
}