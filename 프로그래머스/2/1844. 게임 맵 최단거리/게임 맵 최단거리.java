import java.util.*;

class Solution {
    
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        // 맵 크기
        int n = maps.length;
        int m = maps[0].length;
        
        // 방문체크 배열
        boolean[][] chk = new boolean[n][m];
        // 큐 생성
        Queue<int[]> q = new ArrayDeque<>();
        
        q.offer(new int[]{0, 0, 1});
        chk[0][0] = true;
        
        // bfs
        while(!q.isEmpty()) {
            // Queue에서 꺼내서
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            int dist = cur[2];
            
            // 상대 진영 도착시 return
            if(r == n-1 && c == m-1) return dist;
            
            for(int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                
                // 맵 밖에 벗어나면 continue
                if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                // 방문했으면 continue
                if(chk[nr][nc]) continue;
                // 벽이면 continue
                if(maps[nr][nc] == 0) continue;
                
                chk[nr][nc] = true;
                q.offer(new int[]{nr, nc, dist + 1});
            }
        }
        
        return -1;
    }
}