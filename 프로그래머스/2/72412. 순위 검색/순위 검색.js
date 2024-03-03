function solution(info, query) {
    var answer = [];
    let map = []; //조합 저장
    
    //조합 생성 
    function combination(infos,score,map,start){
        let key = infos.join(""); //문자열로 합쳐서 키 생성
        let value = map[key]; //해당 키 값 가져오기 
        if(value){ //값이 존재하는 경우 
            map[key].push(score); //점수 추가
        }
        else{ //존재하지 않는 경우
            map[key]=[score]; //생성하여 점수 저장 
        }
        //-를 이용한 조합 만들기
        for(let i=start;i<infos.length;i++){
            let arr = [...infos]; //배열 복사 
            arr[i]='-'; //인덱스 값을 '-'로 변경 
            combination(arr,score,map,i+1); //재귀호출로 조합 만들기 
        }
    }
    
    //이진 탐색 
    function search(map,key,score){
        let num = map[key]; //키 값 가져오기 
        
        if(num){ //값이 존재하는 경우 
            let start = 0; //시작 인덱스 
            let end = num.length; //끝 인덱스 
            while(start<end){
                let mid = Math.floor((start+end)/2);
                if(num[mid]>=score){ //중간 값이 찾으려는 점수보다 크거나 같은 경우 
                    end=mid;
                }
                else if(num[mid]<score){ //중간 값이 찾으려는 점수보다 작은 경우 
                    start=mid+1;
                }
            }
            return num.length-start; //찾으려는 점수 이상인 개수 반환
        }
        else{ //값이 존재하지 않는 경우 
            return 0;
        }
    }
    
    //조합 만들기 
    for(let i=0;i<info.length;i++){
        let infos = info[i].split(" "); //공백 기준 문자열 -> 배열 
        let score = infos.pop(); //마지막 요소 -> score, 배열에서 제거 
        combination(infos,score,map,0); //조합 만들기 
    }
    
    //조합의 값들 정렬하기 
    for(let key in map){
        map[key].sort((a,b)=>a-b); //오름차순 정렬 
    }
    
    
    //검색 
    for(let i=0;i<query.length;i++){
        let querys = query[i].replace(/and/g,"").split(" "); //"and" 제거, 공백 기준 문자열 -> 배열
        let score = Number(querys.pop()); //마지막 요소 -> score, 배열에서 제거 
        answer.push(search(map,querys.join(""),score)); //검색 함수 호출, 결과 배열에 추가
    }
    return answer;
}