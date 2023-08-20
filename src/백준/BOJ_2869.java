package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken()); // 낮에 올라감
		int B = Integer.parseInt(st.nextToken()); // 밤에 떨어짐
		int V = Integer.parseInt(st.nextToken()); // 높이
		
		// 하루에 A - B 만큼.
		// V가 되면 B 안뺌

		int N = (V - B) / (A - B); // 며칠?
		
		if((V - B) % (A - B) != 0) {
			N++;
		}
		
		System.out.println(N);
		
	}

}
