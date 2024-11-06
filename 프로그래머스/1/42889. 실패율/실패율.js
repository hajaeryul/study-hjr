function solution(N, stages) {
    const fail = [];
    let player = stages.length;
    
    for(let i = 1; i <= N; i++) {
        const failPlayer = stages.filter(s => s === i).length;
        const rate = player === 0 ? 0 : failPlayer / player;
        
        fail.push({ stage: i, rate: rate });
        
        player -= failPlayer;
    }
    
    fail.sort((a, b) => b.rate - a.rate || a.stage - b.stage);
    // console.log(fail)
    
    
    return fail.map(v => v.stage);
}