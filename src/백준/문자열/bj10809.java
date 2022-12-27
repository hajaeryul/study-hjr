package 백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj10809 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		String askii = "abcdefghijklmnopqrstuvwxyz"; //소문자 a~z 는 아스키코드 97 ~ 122
		int arr[] = new int[26];
		
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < S.length(); j++) {
				if(S.charAt(j) == askii.charAt(i)) {
					arr[i] = j;
					break;
					
				}else {
					arr[i] = -1;
				}
			}
			System.out.print(arr[i] + " ");
		}

	}

}
