function solution(n, times) {
    const arr = times.sort((a, b) => a - b);
    let start = 1;
    let end = arr[arr.length - 1] * n;
    while(start<=end){
        let sum = 0
        let mid = Math.floor((start + end) / 2);
        for(let i=0;i<times.length;i++){
            sum += Math.floor(mid/times[i]);
        }
        if (sum < n) {
            start = mid + 1
        } else {
            end = mid - 1;
        }
    }
    return start;
}