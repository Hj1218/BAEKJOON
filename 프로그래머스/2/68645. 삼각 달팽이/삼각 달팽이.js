function solution(n) {
    var answer = [];
    for(let i=0;i<n;i++){ //피라미드 모양으로 배열 생성 
        let arr = Array.from({length: i+1}, ()=> 0); //길이가 i+1, 값이 0인 배열 생성
        answer.push(arr);
    }
    let count = 0;
    let row = -1;
    let col = 0;
    while(n>0){
        for(let i=0;i<n;i++){ //아래쪽으로 진행
            row++;
            count++;
            answer[row][col] = count;
        }
        for(let i=0;i<n-1;i++){ //오른쪽으로 진행
            col++;
            count++;
            answer[row][col] = count;
        }
        for(let i=0;i<n-2;i++){ //위쪽으로 진행 
            row--;
            col--;
            count++;
            answer[row][col] = count;
        }
        n -= 3;
    }
    const result = answer.reduce(function(a,b){
        return [...a,...b];
    })
    return result;
}