package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1863_스카이라인쉬운거 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = 1;
		Stack<Integer> s = new Stack<>();
		for(int i = 1; i < n; i++) {
			if(arr[i-1] < arr[i]) {
				s.add(arr[i-1]);
				res++;
			} else if(arr[i] == s.peek()) {
				continue;
			}
			
		}
		System.out.println(res);
	}
}
