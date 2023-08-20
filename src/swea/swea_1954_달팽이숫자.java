package swea;

import java.util.Scanner;

public class swea_1954_달팽이숫자 {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
 
            int[][] arr = new int[N][N];
            int[][] delta = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // 동남서북
 
            int k = 1; // 출력하는 값(하나씩 더해갈거에요)
            int a = 0; // 행의 초기값이에요
            int b = -1; // 열의 초기값이에요 처음부터 동쪽 delta를 더해줄거기때문에 -1부터 시작해요
            int idx = 0; // delta를 컨트롤해줄 친구에요 0이면 동쪽, 1이면 남쪽 ...
            int tmp = N; // 숫자들은 5x5 배열이면 5 4 4 3 3 2 2 1 1 이런 규칙을 가지기 때문에 idx가 1,3(세로방향)이 될때마다 하나씩 빼줄거에요
             
            while (k <= N*N) { // k는 N * N 까지 입력할것이기 때문에
                if(idx == 1 || idx ==3) tmp--; // 아래, 세로방향이 될 때에 하나씩 빼주는 if문
                for(int i = 0; i < tmp; i++) { // 좌표를 옮기며 값을 저장하는 for문
                    a = a + delta[idx][0];
                    b = b + delta[idx][1];
                    arr[a][b] = k++;
                }
                idx = (idx + 1) % 4; // 방향 컨트롤러는 0~3을 계속 돌아야 하기 때문에
            }
             
            System.out.println("#" + tc);
            for(int i = 0; i < N; i++) { // 출력하는 for문이에요
                for(int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
 
        } // test case for문
 
    }// main
}// class
