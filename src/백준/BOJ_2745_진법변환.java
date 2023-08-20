package 백준;

import java.util.Scanner;

public class BOJ_2745_진법변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); // N 입력받기 (10진법 넘어가면 A ~ Z 로 표시)
		int B = sc.nextInt(); // 진법 B 입력받기
		
		int tmp = 1; // B진법 첫째자리부터 tmp * B 만큼 곱해줘야 10진법 출력가능
		int res = 0; // 결과값 저장
		
		// 첫째자리부터 (마지막 char부터) 계산
		for(int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i); // 문자열을 문자로 쪼개주기
			// 아스키코드를 이용해 조건문 만들기
			if('0' <= c && c <= '9') {
				res += (c - '0') * tmp; 
			}else {
				res += (c - 'A' + 10) * tmp; // 10부터 A니까 10 더해주기
			}
			tmp *= B; // 첫째자리는 1곱하고, 두번째자리는 B, 세번째자리는 B제곱 ...
		}
		
		System.out.println(res); // 결과값 출력
		
	}
}
