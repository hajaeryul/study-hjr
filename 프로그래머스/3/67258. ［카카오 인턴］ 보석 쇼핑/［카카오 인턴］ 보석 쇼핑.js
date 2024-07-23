function solution(gems) {
    // 서로 다른 보석의 개수 구하기 Set
    const num = new Set(gems).size;
    let ans = [1, gems.length];
    let l = 0, r = 0;
    const map = new Map();
    
    while(r < gems.length) {
        map.set(gems[r], (map.get(gems[r]) || 0) + 1);
                
        while(map.size === num) {
            if(r - l < ans[1] - ans[0]) ans = [l + 1, r + 1];
            
            map.set(gems[l], map.get(gems[l]) - 1);
           if(map.get(gems[l]) === 0) map.delete(gems[l]);
        
            l++;
        }
        
        r++;
    }
    
    return ans;
}