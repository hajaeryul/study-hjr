package 백준.기본수학하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1978 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			boolean flag = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) { // 1은 소수가 아님
				flag = false;
			}
			for(int j = 2; j < num; j++) {
				if(num % j == 0) { // num - 1 까지 나눠서 나머지가 있는지?
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
