package 백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1157 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int arr[] = new int[26];
		int max = 0;
		char result = '?';
		
		for(int i = 0; i < s.length(); i++) {
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { //대문자라면
				arr[s.charAt(i) - 'A']++;
			}else { //소문자라면
				arr[s.charAt(i) - 'a']++;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] == max) {
				result = '?';
			}else if(arr[i] > max) {
				max = arr[i];
				result = (char)(i+'A');
			}
		}
		
		System.out.println(result);

	}

}
