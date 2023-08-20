package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class swea_11315_오목판정 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int[][] delta = { {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1} }; // 상하좌우
         
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            char[][] arr = new char[N][N];
             
            for(int i = 0; i < N; i++) {
                String str = br.readLine();
                for(int j = 0; j < N; j++) {
                    arr[i][j] = str.charAt(j);      
                }
            }// 입력끝
             
            int cnt;
            boolean res = false;
            // 돌멩이 탐색
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(arr[i][j] == 'o') {
                        // 8방 탐색
                        for(int d = 0; d < 8; d++) {
                            cnt = 1;
                            int dr = i + delta[d][0];
                            int dc = j + delta[d][1];
                             
                            if(dr < 0 || dr >= N || dc < 0 || dc >= N) continue;
                            // 다음거도 o 이면 while문 돌리면서 cnt증가
                            if(arr[dr][dc] == 'o') {
                                while(arr[dr][dc] == 'o') {
                                    cnt++;
                                     
                                    dr += delta[d][0];
                                    dc += delta[d][1];
                                     
                                    if(cnt == 5) {
                                        res = true;
                                        break;
                                        }
//                                  if(cnt > 6) { // cnt가 6을 넘으면 break;
//                                      res = false;
//                                      break;
//                                  }
                                    if(dr < 0 || dr >= N || dc < 0 || dc >= N) break; // 범위 벗어나도 break;
                                }
                            }
                             
                        }
 
                         
                    }
                }
            }
            if(res) System.out.println("#" + tc + " YES");
            else System.out.println("#" + tc + " NO");
             
        }// 테스트케이스
    }
}
