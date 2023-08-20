package 백준;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_11022 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int A;
		int B;
		
		for(int i = 1; i <= Num; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + i +": ");
			bw.write(A + " + " + B + " = ");
			bw.write((A + B) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
