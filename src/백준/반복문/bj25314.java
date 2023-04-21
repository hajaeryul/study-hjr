package 백준.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj25314 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N / 4; i++) {
			System.out.print("long ");
		}
		System.out.print("int");

	}

}
