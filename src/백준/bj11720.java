package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11720 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String a = br.readLine();
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i)-48;
		}
		
		System.out.println(sum);

	}

}