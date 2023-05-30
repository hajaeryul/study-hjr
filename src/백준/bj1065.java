package 백준;


import java.util.Scanner;

public class bj1065 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(d(in.nextInt()));
		
		in.close();

	}
	public static int d(int num) {
		int count = 0;
		
		if(num < 100) { // 1~99는 무조건 한수
			count = num;
			
		}else{
			count = 99; // 1~99까지 카운트 하고나서
			
			for(int i = 100; i <= num; i++) {
				int a1 = i % 10; //일의자리수
				int a10 = (i / 10) % 10; //십의자리수
				int a100 = i / 100; // 백의자리수
				
				if((a10 - a1) == (a100 - a10)) { //등차수열이면 더해주기
					count++;
				}
			}
		}
		
		return count;
		
	}

}
