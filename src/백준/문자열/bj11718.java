package 백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11718 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String s = br.readLine();
			if(s == null || s.isEmpty()) {
				break;
			}
			System.out.println(s);
		}
	}

}
