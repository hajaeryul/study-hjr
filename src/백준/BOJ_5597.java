package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5597 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[31]; //출석을 1~30 으로 세기 때문에 31크기의 배열이 필요
		
		for(int i = 1; i < 29; i++) { //true false 배열이 있나?
			int complete = Integer.parseInt(br.readLine());
			arr[complete] = 1;
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}

	}

}