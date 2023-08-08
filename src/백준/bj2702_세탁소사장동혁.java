package 백준;

import java.util.Scanner;

public class bj2702_세탁소사장동혁 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테이스케이스
        for(int i = 0; i < T; i++) {
            int C = sc.nextInt(); // 거스름돈으로 받은 센트
            int Q = C / 25; // 쿼터(25센트) 개수
            int D = (C - (Q * 25)) / 10; // 다임(10센트) 개수
            int N = (C - (Q * 25) - (D * 10)) / 5; // 니켈(5센트) 개수
            int P = C % 5; // 페니(1센트)개수

            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}
