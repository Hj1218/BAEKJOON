function timeToMin(time) { //시간문자열 -> 분 단위로 변환 
  const [hh, mm] = time.split(':').map(Number);
  return hh * 60 + mm;
}

function solution(plans) {
  const stack = [];

  const sortedPlans = plans
    .map(([subject, time, run]) => [subject, timeToMin(time), Number(run)])
    .sort((a, b) => a[1] - b[1]); //시작시간 기준 정렬 

  while (sortedPlans.length) {
    const [subject, time, run] = sortedPlans.shift(); //첫번째 요소 

    stack.forEach((val, idx) => {
      if (time < val[1]) stack[idx][1] += run; //현재 수업의 시작시간보다 전에 끝나는 수업의 종료시간 + run
    });
    stack.push([subject, time + run]); //현재 수업 스택에 추가, 종료시간을 계산하여 저장 
  }

  const answer = stack.sort((a, b) => a[1] - b[1]).map(val => val[0]); //수업 일정을 종료 시간 순으로 정렬
  return answer;
}
