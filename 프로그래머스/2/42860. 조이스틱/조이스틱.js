function solution(name) {
    var answer = 0;
    let min = name.length-1;
    for(let i=0;i<name.length;i++){
        answer += Math.min(name.charCodeAt(i)-65,91-name.charCodeAt(i));
        let index = i+1;
        while(index<name.length && name[index]=='A'){
            index++;
        }
        min = Math.min(min,i*2+name.length-index,(name.length-index)*2+i);
    }
    return answer+min;
}