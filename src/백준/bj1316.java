package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1316 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0; //그룹단어 갯수
		
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine(); //N개의 단어 입력
			
			boolean check[] = new boolean[26]; // 알파벳 사용했는지 조회용
			boolean flag = true; //그룹단어 인지?
			
			for(int j = 0; j < s.length(); j++) {
				int index = s.charAt(j) - 'a';
				if(check[index]) { // 이미 사용한 알파벳
					if(s.charAt(j) != s.charAt(j-1)) { //이전 알파벳과 다르면
						flag = false; //그룹단어 아님
						break;
					}
				}else { //사용하지 않은 알파벳
					check[index] = true; // 알파벳 사용 체크
				}
			}
			if(flag) count++;
		}
		
		System.out.println(count);

	}

}
