package 백준.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2563 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		boolean flag[][] = new boolean[100][100];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j = x; j < x + 10; j++) {
				for(int k = y; k < y + 10; k++) {
					if(!flag[j][k]) {
						flag[j][k] = true;
						count ++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
