package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1216_회문2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine()); // 테스트케이스
			char[][] arr = new char[100][100];
			for(int i = 0; i < 100; i++) {
				String str = br.readLine();
				for(int j = 0; j < 100; j++) {
					arr[i][j] = str.charAt(j);
				}
			}// 입력 완료
			
			int res = 0;
			boolean flag = true;
			
			// 회문의 길이를 100부터 줄여나가면서 찾으면 break하자
			l:
			for(int p = 100; p >= 0; p--) {
				// 가로부터 탐색하자
				for(int i = 0; i < arr.length; i++) { // 한 줄씩 탐색..
					for(int j = 0; j <= arr.length - p; j++) { // 전체길이 - 회문의 길이 까지 탐색하면 될듯
						flag = true;
						// is회문 for문.. 반만 검사하면 돼 -> P / 2
						for(int k = 0; k < p / 2; k++) {
							// 회문이 아니라면 false반환
							if(arr[i][j+k] != arr[i][j + p - 1 - k])
								flag = false;
						}
						// 회문이라면 바로 탈출해버리기!(길이 100인 회문부터 탐색했으니)
						if(flag) {
							res = p;
							break l;
						}
					}
				}
				
				// 세로 탐색
				for(int j = 0; j < arr.length; j++) { // 세로도 한 줄씩 탐색
					for(int i = 0; i <= arr.length - p; i++) {
						flag = true;
						for(int k = 0; k < p / 2; k++) {
							if(arr[i+k][j] != arr[i + p - 1 - k][j])
								flag = false;
						}
						if(flag) {
							res = p;
							break l;
						}
					}
				}
			} // 회문의 길이 for문
			
			System.out.println("#" + tc + " " + res);
		}
	}
}
