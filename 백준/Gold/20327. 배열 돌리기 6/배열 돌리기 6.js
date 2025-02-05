const fs = require('fs');
const filePath = process.platform === 'linux' ? 'dev/stdin' : '백준_js/BOJ_20327/input.txt';
const input = fs.readFileSync(filePath).toString().replace(/\r/g, '').trim().split('\n');

// console.log(input);

// 5부터는 부분배열
// 1, 5: 상하반전, 2, 6: 좌우반전, 3, 7: 오른쪽90도, 4, 8: 왼쪽90도

const [N, R] = input[0].split(' ').map(Number);
const size = 2 ** N;
let arr = input.slice(1, size + 1).map(v => v.split(' ').map(Number));
const calc = input.slice(size + 1).map(v => v.split(' ').map(Number));

// 1 ~ 4번 연산
// 1번 상하반전
const calc1 = (arr) => arr.reverse();

// 2번 좌우반전
const calc2 = (arr) => arr.map(row => row.reverse());

// 3번 오른쪽90도
const calc3 = (arr) => {
    const n = arr.length;
    let newArr = Array.from(Array(n), () => Array(n).fill(0));
    for(let i = 0; i < n; i++) {
        for(let j = 0; j < n; j++) {
            newArr[j][n - 1 - i] = arr[i][j];
        }
    }
    return newArr;
}

// 4번 왼쪽 90도
const calc4 = (arr) => {
    const n = arr.length;
    let newArr = Array.from(Array(n), () => Array(n).fill(0));
    for(let i = 0; i < n; i++) {
        for(let j = 0; j < n; j++) {
            newArr[n - 1 - j][i] = arr[i][j];
        }
    }
    return newArr;
}

// 블럭 쪼개서 안에서 연산
const calcInBlock = (arr, calc, L) => {
    const blockSize = 2 ** L;
    for(let i = 0; i < size; i += blockSize) {
        for(let j = 0; j < size; j += blockSize) {
            let tmp = arr.slice(i, i + blockSize).map(row => row.slice(j, j+ blockSize));
            switch(calc) {
                case 1: tmp = calc1(tmp); break;
                case 2: tmp = calc2(tmp); break;
                case 3: tmp = calc3(tmp); break;
                case 4: tmp = calc4(tmp); break;
            }
            // 적용시키기
            for(let x = 0; x < blockSize; x++) {
                for(let y = 0; y < blockSize; y++) {
                    if(i + x < size && j + y < size)
                    arr[i + x][j + y] = tmp[x][y];
                }
            }
        }
    }
}

// 5 ~ 8번 연산
const blockCalc = (arr, calc, L) => {
    const blockSize = 2 ** L; // 블럭 크기
    const blockNum = size / blockSize; // 블럭 개수
    let newArr = Array.from(Array(size), () => Array(size).fill(0));

    for(let i = 0; i < blockNum; i++) {
        for(let j = 0; j < blockNum; j++) {
            let startX = i * blockSize, startY = j * blockSize;
            let tmp = arr.slice(startX, startX + blockSize).map(row => row.slice(startY, startY + blockSize));

            let newX = i, newY = j;

            // 5번
            if(calc === 5) newX = blockNum - 1 - i;
            // 6번
            else if(calc === 6) newY = blockNum - 1 - j;
            // 7번
            else if(calc === 7) {
                newX = j;
                newY = blockNum - 1 - i;
            // 8번
            }else if(calc === 8) {
                newX = blockNum - 1 - j;
                newY = i;
            }

            let newStartX = newX * blockSize, newStartY = newY * blockSize;
            for(let x = 0; x < blockSize; x++) {
                for(let y = 0; y < blockSize; y++)
                    newArr[newStartX + x][newStartY + y] = tmp[x][y];
            }
        }
    }
    
    return newArr;
}

calc.forEach(([k, L]) => {
    if(k <= 4) calcInBlock(arr, k, L);
    else arr = blockCalc(arr, k, L);
})

console.log(arr.map(row => row.join(' ')).join('\n'));