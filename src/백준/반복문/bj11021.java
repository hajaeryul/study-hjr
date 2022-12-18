package 백준.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj11021 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i <= Num; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			bw.write("Case #" + i +": ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
