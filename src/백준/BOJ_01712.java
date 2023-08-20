package 백준;


import java.util.Scanner;

public class BOJ_01712 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); //고정비
		int B = in.nextInt(); //변동비
		int C = in.nextInt(); //판매가격
		
		// 판매량 x 
		// A + (B * x) - (C * x) = 0
		// (C - B) * x = A
		// x = A / (C - B) >> BEP 일때 판매량 x 니까 1 더해주기(최초로 이익)
		
		// BEP가 없으려면 판매가격이 변동비보다 작거나 같아서 고정비를 깔(-) 수 없어야함
		// C <= B
		
		if(C <= B) {
			System.out.println(-1);
		}else {
			System.out.println((A / (C - B)) + 1);
		}

	}

}
