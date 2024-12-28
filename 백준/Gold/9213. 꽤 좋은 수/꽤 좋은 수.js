const fs = require('fs');
const filePath = process.platform === 'linux' ? 'dev/stdin' : '백준_js/BOJ_9213/input.txt';
const input = fs.readFileSync(filePath).toString().replace(/\r/g, '').trim().split('\n');

// console.log(input);

// 약수의 합 미리 계산
const divSum = Array(1000001).fill(1);
for(let i = 2; i <= 1000000/2; i++) {
    let tmp = i + i;
    while(tmp <= 1000000) {
        divSum[tmp] += i;
        tmp += i;
    }
}

input.forEach((v, idx) => {
    const [st, end, bad] = v.split(' ').map(Number);
    if(st === 0 && end === 0 && bad === 0) process.exit();

    let ans = 0;

    for(let i = st; i <= end; i++){
        if(Math.abs(i - divSum[i]) <= bad) ans++;
    }

    console.log(`Test ${idx+1}: ${ans}`)
})