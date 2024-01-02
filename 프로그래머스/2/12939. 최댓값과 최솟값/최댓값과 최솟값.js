function solution(s) {
    let num = s.split(" ").sort((a,b)=>a-b);
    return num[0]+" "+num[num.length-1];
}