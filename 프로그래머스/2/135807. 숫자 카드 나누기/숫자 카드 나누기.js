function solution(arrayA, arrayB) {
    const sol = (a, b) => {
        while(b !== 0) {
            const tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    const a = arrayA.reduce((acc, cur) => sol(acc, cur));
    const b = arrayB.reduce((acc, cur) => sol(acc, cur));
    
    const isDivisible = (arr, div) => arr.every(n => n % div !== 0);
    
    const resA = isDivisible(arrayB, a) ? a : 0;
    const resB = isDivisible(arrayA, b) ? b : 0;
    
    return Math.max(resA, resB);
}