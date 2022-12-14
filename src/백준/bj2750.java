package 백준;

import java.util.Scanner;

public class bj2750 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int[] Arr = new int[num];
		
		for(int i=0; i<num; i++) {
			 Arr[i] = scanner.nextInt();
		}
		
		for(int i=0; i<Arr.length; i++) {
			for(int j=i; j<Arr.length; j++) {
				if(Arr[i]>Arr[j]) {
					int abc = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = abc;
				}
			}
		}
		for(int i=0; i<num; i++) {
			System.out.println(Arr[i]);
		}
		
	}

}
