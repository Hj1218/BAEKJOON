function solution(m, musicinfos) {
    var answer = [];
    for(let i=0;i<musicinfos.length;i++){
        let [start, end, name, str] = musicinfos[i].split(","); //시작시간, 끝난시간, 제목, 악보
        let [sh, sm] = start.split(":"); //시작시간
        let [eh, em] = end.split(":");  //끝난시간
        let total = (eh-sh)*60+(em-sm); //재생시간
        
        str = str.replace(/(C#)/g,'c').replace(/(D#)/g,'d').replace(/(F#)/g,'f').replace(/(G#)/g,'g').replace(/(A#)/g,'a');
        
        //재생시간만큼 악보 반복
        let s = str.repeat(Math.floor(total/str.length));
        let a = total%str.length;
        s+=str.slice(0,a);
        
        m = m.replace(/(C#)/g,'c').replace(/(D#)/g,'d').replace(/(F#)/g,'f').replace(/(G#)/g,'g').replace(/(A#)/g,'a');
        if(s.includes(m)){
            answer.push([total, name]);
        }
    }
    if(answer.length>0){
        answer.sort((b, c)=>{
           if(b[0]==c[0]){
               return 0;
           }
            return c[0]-b[0];
        });
        return answer[0][1];
    }
    return "(None)";
}
