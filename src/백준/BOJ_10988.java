package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		int A = 1;
		
		for(int i = S.length() - 1; i >= 0; i--) {
			char c = S.charAt(i);
			
			if(c != S.charAt(S.length() - i  - 1)) {
				A = 0;
				break;
			}
		}
		
		System.out.println(A);
		
		br.close();
	}

}
