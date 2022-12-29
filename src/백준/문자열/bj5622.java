package 백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj5622 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		//ABC = 3초, DEF = 4초 ... WXYZ = 10초
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < 68) { // ABC
				count += 3;
			}else if(s.charAt(i) < 71) { //DEF
				count += 4;
			}else if(s.charAt(i) < 74) { //GHI
				count += 5;
			}else if(s.charAt(i) < 77) { //JKL
				count += 6;
			}else if(s.charAt(i) < 80) { //MNO
				count += 7;
			}else if(s.charAt(i) < 83) { //PQRS
				count += 8;
			}else if(s.charAt(i) < 86) { //TUV
				count += 9;
			}else { // WXYZ
				count += 10;
			}
		}
		
		System.out.println(count);

	}

}
