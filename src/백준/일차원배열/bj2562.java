package 백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2562 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < 9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				count = (i + 1);
			}
		}
		System.out.println(max);
		System.out.println(count);

	}

}
