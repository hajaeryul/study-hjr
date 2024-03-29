package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11653 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		for(int i = 2; i < N; i++) {
			while(N % i ==0) {
				System.out.println(i);
				N /= i;
			}
		}
		if(N != 1) {
			System.out.println(N);
		}
	}

}
