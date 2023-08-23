package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1248_공통조상 {
	public static int[][] lr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken()); // 정점의 개수 10~10000
			int E = Integer.parseInt(st.nextToken()); // 간선의 개수
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			boolean[] check = new boolean[V + 1]; // x가 지나간 정점인지 쳌
			lr = new int[V+1][2]; // [][0] 은 왼쪽자식 [][1]은 오른쪽자식
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= E; i++) {
				int tmpA = Integer.parseInt(st.nextToken());
				int tmpB = Integer.parseInt(st.nextToken());
				if(lr[tmpA][0] == 0) {
					lr[tmpA][0] = tmpB;				
				} else {
					lr[tmpA][1] = tmpB;
				}
			}
			while(x > 0) { // x가 부모 타고타고 올라가면서 true로 바꾸기
				check[x] = true;
				x = findRowIndex(x, lr);
			}
			while(y > 0) { // y도 부모 타고타고 올라가면서 true만나면 break;
				if(check[y] == true) {
					System.out.print("#" + tc + " " + y);
					break;
				} else {
					y = findRowIndex(y, lr);
				}
			}
//			for(int i = 0; i < lr.length; i++) {
//				for(int j = 0 ; j < 2; j++) {
//					System.out.print(lr[i][j] + " ");
//				}
//			}
			System.out.print(" " + findSubtreeSize(y) + "\n");
			
			
		}
	}
	// 해당 값을 가지는 row 인덱스를 반환하는 함수
	public static int findRowIndex(int value, int[][] arr) {
		int index = -1;
		int i, j;
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < 2; j++) {
				if(arr[i][j] == value) {
					index = i;
				}
			}
		}
		return index;
	}
	// 해당 정점을 root로 하는 서브 트리 크기 찾는 함수
	public static int findSubtreeSize(int p) {
		if (p == 0) {
            return 0;
        }

        return 1 + findSubtreeSize(lr[p][0]) + findSubtreeSize(lr[p][1]);
	}
}
