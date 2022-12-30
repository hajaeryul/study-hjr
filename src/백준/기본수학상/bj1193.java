package 백준.기본수학상;

import java.util.Scanner;

public class bj1193 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		
		// 분수라고 생각하지 말아보자
		
		// 1개 2개 3개 4개로 나뉘어서..
		// ragne = range + 1
		// X가 5라면 3번째 range의 두번째값
		// (짝수)왼쪽수는 1에서 +1,  오른쪽수는 range 에서 -1 (두번째값이니)
		// 홀수는 반대..
		// 범위의 몇번째 값인지 구해야함
		
		int range = 0;
		int count = 1; //범위의 몇번째 수인지
		
		while(range < X) { // X가 범위 벗어나면 종료
			count ++;
			if(X == count) {
				range = range + 1;
				count = 1;
			}
		}
		if(range % 2 == 0) {
			System.out.println(((count - 1) + 1) + "/" + (range - (count - 1)));
		}else {
			System.out.println((range - (count - 1)) + "/" + ((count - 1) + 1));
		}
	}

}
