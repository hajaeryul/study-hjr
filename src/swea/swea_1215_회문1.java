package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1215_회문1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int tc = 1; tc <= 10; tc++) {
			int P = Integer.parseInt(br.readLine()); // 회문의 길이
			char[][] arr = new char[8][8];
			for(int i = 0; i < 8; i++) {
				String str = br.readLine();
				for(int j = 0; j < 8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}// 입력 완료
			int cnt = 0;
			boolean flag = true;
			
			// 가로부터 탐색하자
			for(int i = 0; i < arr.length; i++) { // 한 줄씩 탐색..
				for(int j = 0; j <= arr.length - P; j++) { // 전체길이 - 회문의 길이 까지 탐색하면 될듯
					flag = true;
					// is회문 for문.. 반만 검사하면 돼 -> P / 2
					for(int k = 0; k < P / 2; k++) {
						// 회문이 아니라면 false반환
						if(arr[i][j+k] != arr[i][j + P - 1 - k])
							flag = false;
					}
					// 회문이라면 true 잘 빠져나와서 cnt를 올려준다
					if(flag) cnt++;
				}
			}
			
			// 세로 탐색
			for(int j = 0; j < arr.length; j++) { // 세로도 한 줄씩 탐색
				for(int i = 0; i <= arr.length - P; i++) {
					flag = true;
					for(int k = 0; k < P / 2; k++) {
						// 회문이 아니라면 false반환
						if(arr[i+k][j] != arr[i + P - 1 - k][j])
							flag = false;
					}
					if(flag) cnt++;
				}
			}
			// 출력
			System.out.println("#" + tc + " " + cnt);
		}
	}
}
