function solution(brown, yellow) {
    var answer = [];
    let width = (brown - 2) / 2;
    let height = 3;
    let res = width * height - brown - yellow;
    
    while(res !== 0) {
        width--;
        height++;
        
        res = width * height - brown - yellow;
    }
    
    return [width, height];
    
}