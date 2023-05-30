package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2941 {

	public static void main(String[] args) throws IOException{
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == 'c' && i < s.length() - 1) {
				if(s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') { // c=, c-
					i++;
				}
				
			}else if(s.charAt(i) == 'd' && i < s.length() - 1) {
				if(s.charAt(i + 1) == '-') { // d-
					i++;
				}else if(s.charAt(i + 1) == 'z' && i < s.length() - 2) {
					if(s.charAt(i + 2) == '=') { // dz=
						i += 2;
					}
				}
				
			}else if(s.charAt(i) == 'l' && i < s.length() - 1) {
				if(s.charAt(i + 1) == 'j') { // lj
					i++;
				}
				
			}else if(s.charAt(i) == 'n' && i < s.length() - 1) {
				if(s.charAt(i + 1) == 'j') { // nj
					i++;
				}
				
			}else if(s.charAt(i) == 's' && i < s.length() - 1) {
				if(s.charAt(i + 1) == '=') { // s=
					i++;
				}
				
			}else if(s.charAt(i) == 'z' && i < s.length() - 1) {
				if(s.charAt(i + 1) == '=') { // z=
					i++;
				}
			}
			
			count++;
		}
		
		System.out.println(count);

	}

}
