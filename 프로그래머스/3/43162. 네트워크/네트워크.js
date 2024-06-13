function solution(n, computers) {
    var answer = 0;
    let chk = [];
    
    for(let i = 0; i < n; i++){
        if(!chk[i]){
            dfs(i, chk, computers);
            answer++;
        }
    }    
    return answer;
}

const dfs = (v, chk, computers) => {
    chk[v] = true; // 방문체크
    for(let i = 0; i < computers.length; i++){
        if(computers[v][i] === 1 && !chk[i]) dfs(i, chk, computers);
    }
}