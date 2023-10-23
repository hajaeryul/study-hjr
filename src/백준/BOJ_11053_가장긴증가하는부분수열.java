package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11053_가장긴증가하는부분수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int A = Integer.parseInt(br.readLine());
		int[] arr = new int[A+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= A; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[A+1];
		
		for(int i = 1; i <= A; i++) {
			dp[i] = 1;
			for(int j = 1; j <= i; j++) {
				if(arr[j] < arr[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		System.out.println(Arrays.toString(dp));
		int max = 0;
		for(int a : dp) max = a > max ? a : max;
		System.out.println(max);
	}
}