package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_11000_강의실배정 {
	
	static class Tmp {
		int s, e;

		public Tmp(int s, int e) {
			this.s = s;
			this.e = e;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Tmp[] arr = new Tmp[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Tmp(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr, (a, b) -> a.s == b.s ? a.e - b.e : a.s - b.s);
//		for(int i = 0; i < N; i++) System.out.println(arr[i].s + " " + arr[i].e);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i < N; i++) pq.add(arr[i].e);
		
		int cnt = 1;
		for(int i = 1; i < N; i++) {
			if(arr[i].s < pq.peek()) cnt++;
			else pq.poll();
			pq.add(arr[i].e);
		}
		
		System.out.println(cnt);
	}
}
