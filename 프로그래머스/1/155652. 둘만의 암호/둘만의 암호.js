function solution(s, skip, index) {
    var answer = '';
    let arr = [...'abcdefghijklmnopqrstuvwxyz'].filter(alp => !skip.includes(alp));
    for(let i=0;i<s.length;i++){
        let arrindex = arr.indexOf(s[i])+index;
        let b =arr[arrindex%arr.length];
        answer+=b;
    }
    return answer;
}