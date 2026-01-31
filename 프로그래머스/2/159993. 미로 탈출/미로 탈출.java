import java.util.*;

class Solution {
    
    static int[] dr= {-1, 1, 0, 0};
    static int[] dc= {0, 0, -1, 1};
    
    public int solution(String[] maps) {
        // 2차원배열 크기 지정해주기
        int n = maps.length;
        int m = maps[0].length();
        
        // S, L, E의 좌표 설정
        int sr = -1, sc = -1, lr = -1, lc = -1, er = -1, ec = -1;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);
                if(c == 'S'){sr = i; sc = j;}
                else if(c == 'L'){lr = i; lc = j;}
                else if(c == 'E'){er = i; ec = j;}
            }
        }
        
        // 설정한 좌표로 S -> L bfs 돌려 거리구하기
        int b1 = bfs(maps, n, m, sr, sc, lr, lc);
        if(b1 == -1) return -1;
        
        // 설정한 좌표로 L -> E bfs 돌려 거리구하기
        int b2 = bfs(maps, n, m, lr, lc, er, ec);
        if(b2 == -1) return -1;
        
        return b1 + b2;
    }
    
    // BFS함수
    public int bfs(String[] maps, int n, int m, int r1, int c1, int r2, int c2){
        // 방문체크
        boolean[][] chk = new boolean[n][m];
        // ArrayList를 썼지만... ArrayDeque를 써보자
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{r1, c1, 0});
        chk[r1][c1] = true;
        
        while(!q.isEmpty()){
            // 현재 좌표와 거리 뽑아서
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], dist = cur[2];
            
            // L이나 E에 도달했으면 거리 return
            if(r == r2 && c == c2) return dist;
            
            for(int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
            
                // 전체 크기 벗어나면 continue
                if(nr < 0 || nc < 0 || nr >= n || nc >= m) continue;
                // 이미 방문했어도 continue
                if(chk[nr][nc]) continue;
                // 벽 만나도 continue
                char ch = maps[nr].charAt(nc);
                if(ch == 'X') continue;
                
                // 방문체크 해주고
                chk[nr][nc] = true;
                // q에 거리+1에서 넣어주기
                q.add(new int[]{nr, nc, dist + 1});
            }
        }
        return -1;
    }
    
}