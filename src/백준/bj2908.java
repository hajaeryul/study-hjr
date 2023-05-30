package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2908 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		int C = ((int)(A.charAt(0) - '0') + (int)((A.charAt(1)- '0') * 10) + (int)((A.charAt(2) - '0') * 100));
		int D = ((int)(B.charAt(0) - '0') + (int)((B.charAt(1)- '0') * 10) + (int)((B.charAt(2) - '0') * 100));
		
		System.out.println(C > D ? C : D);
		
	}

}
