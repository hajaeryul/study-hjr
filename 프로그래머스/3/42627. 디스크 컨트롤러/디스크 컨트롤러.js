function solution(jobs) {
    const len = jobs.length;
    // 시작 시간 정렬
    jobs.sort(([a,],[b, ]) => a - b);
    // 대기
    let wait = [];
    // 걸린 시간
    let answer = [];
    // 현재 시간
    let time = 0;
    
    // 작업이 남아있거나 대기 남아있으면
    while(jobs.length || wait.length) {
        while(jobs.length && jobs[0][0] <= time) {
            wait.push(jobs.shift());
        }
        
        if(!wait.length) time++;
        
        wait.sort(([,a],[,b]) => a - b);
        
        if(wait.length) {
            const [req, jobTime] = wait.shift();
            time += jobTime;
            answer.push(time - req);
        }
    }
    
    // console.log(answer);
    
    return Math.floor(answer.reduce((acc, cur) => (acc + cur) , 0) / len);
}