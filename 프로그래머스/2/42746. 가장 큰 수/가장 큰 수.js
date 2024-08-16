function solution(numbers) {
    // string으로 바꿔서 이어붙인거 비교
    const arr = numbers.map(e => e+'').sort((a, b) => (b + a) - (a + b));
    return +arr.join('') === 0 ? '0' : arr.join('');
}