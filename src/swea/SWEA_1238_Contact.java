package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
// 2가 된다. 이거는 쓰레기코드
public class SWEA_1238_Contact {
	static List<Integer>[] list;
	static boolean[] chk;
	static Queue<Node> q;
	static int max,tmp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = 10;
		for(int tc = 1; tc <= T; tc++) {
			list = new ArrayList[101];
			for(int i = 1; i < 101; i++) {
				list[i] = new ArrayList<>();
			}
			
			st = new StringTokenizer(br.readLine());
			int input = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < input/2; i++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(!list[a].contains(b)) list[a].add(b);
			}
			tmp = 0;
			chk = new boolean[101];
			q = new LinkedList<Node>();
			
			q.add(new Node(start, 0));
			while(!q.isEmpty()) {
				max = 0;
				bfs(q.poll());
			}
			System.out.println("#"+ tc + " " + max);
			
		}// tc
	}
	
	static void bfs(Node x) {
		chk[x.v] = true;
		
		for(int i = 0; i < list[x.v].size(); i++) {
			if(!chk[list[x.v].get(i)]) q.add(new Node(list[x.v].get(i),x.cnt+1));
		}
//		if(!q.isEmpty()&& q.peek().cnt > tmp) {
//			max = 0;
//			tmp = q.peek().cnt;
//			max = max < q.peek().v ? q.peek().v : max;
//		}
		if (!q.isEmpty() && q.peek().cnt > tmp) {
		    tmp = q.peek().cnt;
		    max = q.peek().v; // max를 현재의 최댓값으로 업데이트
		}
	}
	
	
	static class Node {
		int v, cnt;
		Node(int v, int cnt) {
			this.v=v;
			this.cnt=cnt;
		}
}
	
}