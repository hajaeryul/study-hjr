package 백준;

import java.util.Scanner;

public class BOJ_10798_세로읽기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] cArr = new char[5][15]; // 2차원 배열 선언
		int max = 0; // 가장 긴 문자열 길이 저장용
		
		for(int i = 0; i < 5; i++) { // 다섯 개의 단어니까
			String str = sc.next(); // 입력 받기
			max = Math.max(max, str.length()); // 가장 긴 문자열 길이 저장
			for(int j = 0; j < str.length(); j++) {
				cArr[i][j] = str.charAt(j); // 빈 2차원배열에 문자 하나하나 저장
			}
		}
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				if(cArr[j][i] == '\0') { // char 배열의 초기값은 '\0'
					continue; // 비어있으면 다음걸로 넘어가기
				}
				
				System.out.print(cArr[j][i]);
			}
		}
	}
}
