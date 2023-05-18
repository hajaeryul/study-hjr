package 백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj9086 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			
			System.out.println(String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.length()-1)));
		}
	}

}
