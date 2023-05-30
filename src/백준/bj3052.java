package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj3052 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[10];
		
		int count = 0;
		boolean flag;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		for(int i = 0; i < 10; i++) {
			flag = false;
			for(int j = i+1; j < 10; j++) {
				if(arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				count++;
			}
		}
		System.out.println(count);

	}

}
