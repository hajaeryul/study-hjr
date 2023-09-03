package swea;

import java.util.Scanner;

public class SWEA_1961_숫자배열회전 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int Tc = sc.nextInt();
         
        for(int T = 1; T <= Tc; T++) { // TestCase 만큼 반복
            int N = sc.nextInt();
            int arr[][] = new int[N][N];
             
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt(); //2차원배열에 N x N 행렬 입력
                }
            }
             
            System.out.println("#" + T);
             
             
            for(int j = 0, k = (N-1); j < N || k > 0; j++, k--) {
                for(int i = (N - 1); i >= 0; i--) {
                    System.out.print(arr[i][j]);
                }
                System.out.print(" ");
                
                for(int i = (N - 1); i >= 0; i--) {
                    System.out.print(arr[k][i]);
                }
                System.out.print(" ");
                 
                for(int i = 0; i < N; i++) {
                    System.out.print(arr[i][k]);
                }
                System.out.println();
            }
        }//T
    }//main
}