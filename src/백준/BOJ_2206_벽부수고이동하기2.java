package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2206_벽부수고이동하기2 {
    static int N, M;
    static int[][] map;
    static int[][][] dist; // dist[x][y][z]: (x, y) 위치에 벽을 z번 부순 상태에서의 최단 이동 거리
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        dist = new int[N][M][2];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = input.charAt(j) - '0';
                for (int k = 0; k < 2; k++) {
                    dist[i][j][k] = -1; // 초기값을 -1로 설정
                }
            }
        }

        int result = bfs();
        System.out.println(result);
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 0}); // (x, y, 벽 부수는 상태: 0 or 1)
        dist[0][0][0] = 1;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            int wallBreak = current[2];

            if (x == N - 1 && y == M - 1) {
                return dist[x][y][wallBreak];
            }

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (map[nx][ny] == 0 && dist[nx][ny][wallBreak] == -1) {
                        dist[nx][ny][wallBreak] = dist[x][y][wallBreak] + 1;
                        q.add(new int[]{nx, ny, wallBreak});
                    } else if (wallBreak == 0 && map[nx][ny] == 1 && dist[nx][ny][1] == -1) {
                        dist[nx][ny][1] = dist[x][y][wallBreak] + 1;
                        q.add(new int[]{nx, ny, 1});
                    }
                }
            }
        }

        return -1; // 도달할 수 없는 경우
    }
}
