package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_모의SW역량테스트_보호필름 {
    static int D, W, K; // 두께 D, 가로 W, 합격기준 K
    static int[][] film; // 필름 2차원배열
    static int min; // 최소 주입 횟수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
        	st = new StringTokenizer(br.readLine());
            D = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            film = new int[D][W];

            for (int i = 0; i < D; i++) {
            	st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    film[i][j] = Integer.parseInt(st.nextToken());
                }
            }// 입력 완료

            min = Integer.MAX_VALUE; // 최소값 구해야 하니 초기화 
            sol(0, 0);
            
            System.out.println("#" + tc + " " + min);
        }
    }

    // 모두 주입해보자!
    static void sol(int idx, int cnt) {
    	// 기저 파트
    	// 모든 행에 주입 끝나면 성능검사
    	if (cnt >= min) return; // 앞서 진행한 케이스보다 커지면 빠꾸시켜
        if (idx == D) {
            if (check()) { // 성능검사 합격한 cnt들만 여기온다
                min = Math.min(min, cnt);
            }
            return;
        }

        // 해당 행에 약품을 주지 않는 경우
        sol(idx + 1, cnt);

        // 해당 행에 약품 A 주입
        int[] tmp = film[idx].clone(); // 한 줄 미리 복사놓고
        for (int i = 0; i < W; i++) {
            film[idx][i] = 0; // 해당 행을 0(A)로 바꿔
        }
        sol(idx + 1, cnt + 1); // cnt + 1 시키고 다음행 진행
        film[idx] = tmp.clone(); // 원상복구

        // 해당 행에 약품 B 주입
        for (int i = 0; i < W; i++) {
            film[idx][i] = 1; // 해당 행을 1(B)로 바꿔
        }
        sol(idx + 1, cnt + 1); // cnt + 1 시키고 다음행 진행
        film[idx] = tmp.clone(); // 원상복구
    }
    
    // 성능 검사 함수
    static boolean check() {
    	// 행 돌면서 세로로 검사할거야
        for (int j = 0; j < W; j++) {
            int cnt = 1; // 연속된 셀을 검사할거니 1부터
            boolean pass = false; // 합격하면 true로 바꿔주자
            
            for (int i = 1; i < D; i++) {
                if (film[i - 1][j] == film[i][j]) { // 이전셀과 이번셀이 같으면 
                    cnt++; // cnt++
                    if (cnt >= K) { // K까지 도달하거나 그이상이면
                        pass = true; // true로 바꿔!
                        break;
                    }
                } else { // K까지 도달 못했으면 cnt초기화 시켜주기
                    cnt = 1;
                }
            }
            if (!pass) return false;
        }
        return true;
    }
}
