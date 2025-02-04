const fs = require('fs');
const filePath = process.platform === 'linux' ? 'dev/stdin' : '백준_js/BOJ_1022/input.txt';
const input = fs.readFileSync(filePath).toString().replace(/\r/g, '').trim().split(' ').map(Number);

// console.log(input);

const [r1, c1, r2, c2] = input;

let grid = Array.from(Array(r2 - r1 + 1), () => Array(c2 - c1 + 1).fill(0))
let maxLen = 0;

// r, c에 해당하는 숫자 찾기
const getNum = (r, c) => {
    let maxLevel = Math.max(Math.abs(r), Math.abs(c)); // 소용돌이 몇레벨인지
    let maxNum = (2 * maxLevel + 1) ** 2; // 그 레벨 제일 큰 숫자

    if(r === maxLevel) return maxNum - (maxLevel - c); // 아래(오른쪽에서 왼쪽)
    else if(c === -maxLevel) return maxNum - (2 * maxLevel) - (maxLevel - r); // 왼(아래쪽에서 위쪽)
    else if(r === -maxLevel) return maxNum - (4 * maxLevel) - (maxLevel + c); // 위(왼쪽에서 오른쪽)
    else return maxNum - (6 * maxLevel) - (maxLevel + r); // 오(위쪽에서 아래쪽)
}

// grid 채우기
for(let i = 0; i <= r2 - r1; i++) {
    for(let j = 0; j <= c2 - c1; j++) {
        let num = getNum(r1 + i, c1 + j);
        grid[i][j] = num;
        maxLen = Math.max(maxLen, num.toString().length);
    }
}

console.log(grid.map(v => v.map(n => n.toString().padStart(maxLen, ' ')).join(' ')).join('\n'))