function solution(skill, skill_trees) {
    let answer = 0;
    for (let i = 0; i < skill_trees.length; i++) {
        let idx = 0;
        let flag = true;

        for (let j = 0; j < skill_trees[i].length; j++) {
            const temp = skill_trees[i][j];
            if (skill.includes(temp)) {
                if (temp !== skill[idx]) {
                    flag = false;
                    break;
                }
                idx++;
            }
        }
        if (flag) {
            answer++;
        }
    }

    return answer;
}