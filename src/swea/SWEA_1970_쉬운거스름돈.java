package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_1970_쉬운거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            int money = Integer.parseInt(br.readLine()) / 10;
            int[] dp = new int[money+1];
            
            // dp 테이블에 화폐 단위별로 사용된 개수를 저장
            int[][] usedCount = new int[money+1][8];
            
            int[] coins = {1, 5, 10, 50, 100, 500, 1000, 5000};
            
            for(int i = 1; i <= money; i++) {
                int min = 987654321;
                int usedCoin = 0; // 현재 화폐 단위를 몇 개 사용했는지 저장용
                
//              if(i >= 5) min = Math.min(min, dp[i-5]+1);
//				if(i >= 10) min = Math.min(min, dp[i-10]+1);
//				if(i >= 50) min = Math.min(min, dp[i-50]+1);
//				if(i >= 100) min = Math.min(min, dp[i-100]+1);
//				if(i >= 500) min = Math.min(min, dp[i-500]+1);
//				if(i >= 1000) min = Math.min(min, dp[i-1000]+1);
//				if(i >= 5000) min = Math.min(min, dp[i-5000]+1);
                
                for (int j = 0; j < coins.length; j++) {
                	
                    if (i >= coins[j] && min > dp[i - coins[j]] + 1) {
                        min = dp[i - coins[j]] + 1;
                        usedCoin = coins[j]; 
                    }
                }
                dp[i] = min;
                
                // 화폐 단위별로 사용된 개수를 업데이트
                for (int j = 0; j < coins.length; j++) {
                    usedCount[i][j] = usedCount[i - usedCoin][j];
                }
                for (int j = 0; j < coins.length; j++) {
                    if (usedCoin == coins[j]) {
                        usedCount[i][j]++;
                        break;
                    }
                }
            }

//            System.out.println(Arrays.toString(dp));
            System.out.print("#" + tc + " \n");
            for(int i = coins.length-1; i >= 0; i--) {
            	System.out.print(usedCount[money][i] + " ");
            }
            System.out.println();
//            System.out.println("5000원 개수: " + usedCount[money][7]);
//            System.out.println("1000원 개수: " + usedCount[money][6]);
//            System.out.println("500원 개수: " + usedCount[money][5]);
//            System.out.println("100원 개수: " + usedCount[money][4]);
//            System.out.println("50원 개수: " + usedCount[money][3]);
//            System.out.println("10원 개수: " + usedCount[money][2]);
//            System.out.println("5원 개수: " + usedCount[money][1]);
//            System.out.println("1원 개수: " + usedCount[money][0]);
        }
    }
}
