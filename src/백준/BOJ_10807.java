package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < arr.length; j++) { //v 찾을때마다 count증가
			if(arr[j] == v) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
