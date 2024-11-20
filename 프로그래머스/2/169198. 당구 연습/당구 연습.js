function solution(m, n, startX, startY, balls) {
    const answer = [];

    balls.forEach(([x, y]) => {
        const distances = [];

        // 위 쿠션
        if (!(startX === x && startY < y)) {
            distances.push((x - startX) ** 2 + (2 * n - startY - y) ** 2);
        }

        // 아래 쿠션
        if (!(startX === x && startY > y)) {
            distances.push((x - startX) ** 2 + (startY + y) ** 2);
        }

        // 오른쪽 쿠션
        if (!(startY === y && startX < x)) {
            distances.push((2 * m - startX - x) ** 2 + (startY - y) ** 2);
        }

        // 왼쪽 쿠션
        if (!(startY === y && startX > x)) {
            distances.push((startX + x) ** 2 + (startY - y) ** 2);
        }

        // console.log(distances)
        // 최소 거리만 추가
        answer.push(Math.min(...distances));
    });
    return answer;
}