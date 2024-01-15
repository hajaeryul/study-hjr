package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_20055_컨베이어벨트위의로봇 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		// 0 ~ N-1 : 위를 감싸는 벨트, N ~ 2*N-1 : 아래를 감싸는 벨트
		for(int i = 0; i < 2*N; i++) list.add(Integer.parseInt(st.nextToken()));
		
		boolean[] robot = new boolean[N]; // 위를 감싸는 벨트에 로봇이 있으면 true
//		System.out.println(list);
		
		int cnt = 0;
		int turn = 1; // 1단계부터 시작해요
		while(true) {
			// 1번과정 : 벨트가 로봇과 함께 한 칸 회전
			// 원형 구조니까 마지막껄 빼서 0번인덱스에 넣어주기
			list.add(0, list.get(2*N-1));
			list.remove(2*N);
			// 로봇들 한 칸씩 회전(다음칸을 바꾸는거니까 뒤에서부터 바꿔주기)
			for(int i = N-1; i >= 0; i--) {
				if(robot[i]) {
					robot[i] = false;
					robot[i+1] = true;
				}
			}
//			System.out.println("한 칸 옮기기"+list);
//			System.out.println("로봇전"+Arrays.toString(robot));
			
			// 2번과정 : 먼저 올라간 로봇부터 이동 가능하면 이동하기
			for(int i = N-2; i >= 0; i--) {
				robot[N-1] = false; // 내리는 위치에 도달하면 즉시 내리니까 false로 때려박아
				// 다음칸 내구도가 1이상이고, 해당 칸에 로봇이 있고, 다음 칸에 로봇이 없으면 이동하기
				if(list.get(i+1) > 0 && robot[i] && !robot[i+1]) {
					robot[i] = false;
					robot[i+1] = true;
					// 로봇이 이동했다면, 다음 칸 내구도 감소
					list.set(i+1, list.get(i+1) - 1);
					// 내구도가 0이 되었다면 cnt를 증가시키기
					if(list.get(i+1) == 0) cnt++;
				}
			}
//			System.out.println("로봇후"+Arrays.toString(robot));
//			System.out.println("로봇 옮기기"+list);
			
			// 3번과정 : 올리는 위치 내구도가 1이상이면 로봇 올리기
			if(list.get(0) > 0) {
				robot[0] = true;
				list.set(0 ,list.get(0) - 1); // 로봇 올렸으면 내구도 감소
				// 내구도 0이 되었다면 cnt증가
				if(list.get(0) == 0) cnt++;
			}
//			System.out.println("로봇 놓기" + list);
//			System.out.println(Arrays.toString(robot));
			
			// 내구도 0인 칸이 K이상이 되었다면 while문 탈출하기
			if(cnt >= K) break;
			turn++; // 그렇지 않다면 턴을 증가시키고 while문 또 돌아~
			
//			System.out.println(turn + "번째 단계 %%%%%%%%%%%%%%%");
//			System.out.println("최종"+list);
		}
		System.out.println(turn);
	}
}
