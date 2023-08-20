package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2444 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		br.close();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N - i; j++) {
				bw.write(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		for(int i = N - 1; i >= 1; i--) {
			for(int j = 1; j <= N - i; j++) {
				bw.write(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}

}
