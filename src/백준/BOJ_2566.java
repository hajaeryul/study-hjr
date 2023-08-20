package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2566 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A[][] = new int[9][9];
		int max = 0;
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 9; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				
				if(A[i][j] > max) {
					max = A[i][j];
					x = i;
					y = j;
				}
			}
		}

		System.out.println(max);
		System.out.println((x+1) + " " + (y+1));
	}

}
