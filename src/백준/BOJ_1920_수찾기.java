package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920_수찾기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// A 배열 입력
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arrA = new int[N];
		for(int i = 0; i < N; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrA);
		// 존재하는지 확인할 수 입력
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arrB = new int[M];
		for(int i = 0; i < M; i++) {
			arrB[i] = Integer.parseInt(st.nextToken());
		}
		
		// 이진탐색
		for(int i = 0; i < M; i++) {
			int start = 0;
			int end = N - 1;
			while(start <= end) {
				int mid = (start + end) / 2;
				if(arrB[i] == arrA[mid]) {
					System.out.println(1);
					break;
				}
				if(arrB[i] < arrA[mid]) {
					end = mid- 1 ;
				}else {
					start = mid + 1;
				}
			}
			if(start > end) System.out.println(0);
		}
	}
}
