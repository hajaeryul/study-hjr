package 백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10813 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < M; i++) {
			int num;
			st = new StringTokenizer(br.readLine());
			
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			num = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = num;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
