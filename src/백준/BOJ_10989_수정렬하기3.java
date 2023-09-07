package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10989_수정렬하기3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		int K = -1;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(K < arr[i]) K = arr[i];
		}
		
		int[] count = new int[K+1];
		
		for(int i = 0; i < N; i++) {
			 count[arr[i]]++;
		 }
		 
		 for(int i = 1; i < count.length; i++) {
			 count[i] += count[i-1];
		 }
		 
		 int[] sortArr = new int[N];
		 
		 for(int i = N - 1; i >= 0; i--) {
			 sortArr[--count[arr[i]]] = arr[i];
		 }
		 
		 for(int i = 0; i < N; i++) {
			 sb.append(sortArr[i]).append("\n");
		 }
		 
		 System.out.println(sb);
	}
}