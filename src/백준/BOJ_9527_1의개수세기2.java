package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_9527_1의개수세기2 {
	
	static long[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Long A = Long.parseLong(st.nextToken());
		Long B = Long.parseLong(st.nextToken());
		dp = new long[55];
		// 누적합 dp[n] = dp[n-1] * 2 + 2^n
		dp[0] = 1;
		for(int i = 1; i < 55; i++) dp[i] = dp[i-1] * 2 + (1L << i);
//		System.out.println(Arrays.toString(dp));
		System.out.println(sol(B) - sol(A-1));
//		System.out.println(sol(B) + " B");
//		System.out.println((sol(A-1) + " A"));
		
	
	}
	
	static long sol(long n) {
		long cnt = n & 1;
		int tmp = (int) (Math.log(n) / Math.log(2)); 
		for(int i = tmp; i > 0; i--) {
			if((n & (1L << i)) != 0L) {
				cnt += dp[i-1] + (n - (1L << i) + 1);
				n -= (1L << i);
			}
		}
		return cnt;
	}
	
}
