package 백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10811 {

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
			st = new StringTokenizer(br.readLine());
			
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			int tmp[] = new int[J-I+1];
			int num = 0;
			for(int j = (J-1); j >= (I-1); j--) {
				tmp[num] = arr[j];
				num++;
			}
			num = I-1;
			for(int r : tmp) {
				arr[num] = r;
				num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
