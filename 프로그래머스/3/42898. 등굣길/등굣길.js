function solution(m, n, puddles) {
    let arr = new Array(n).fill(0).map(()=> new Array(m).fill(0));
    puddles.forEach(([x,y])=>arr[y-1][x-1]=-1);
    arr[0][0]=1;
    for(let i=0;i<n;i++){
        for(let j=0;j<m;j++){
            if(i==0&&j==0){
                continue;
            }
            if(arr[i][j]!=-1){
                let a = (i>0&&arr[i-1][j]!==-1)?arr[i-1][j]:0;
                let b = (j>0&&arr[i][j-1]!==-1)?arr[i][j-1]:0;
                arr[i][j] = (a+b)%1000000007;
            }
            else{
                arr[i][j]=0;
            }
        }
    }
    return arr[n-1][m-1];
}