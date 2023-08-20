package 백준;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		// 양수를 가정하겠다
				int[] arr = {8, 8, 24, 12, 19, 3, 45, 60}; 
				int N = arr.length;
				
				int K = -1;
				for(int i = 0; i < N; i++) {
					if(arr[i] > K) K = arr[i];
				}
				
				int[] cnt = new int[K + 1];
				for(int i = 0; i < N; i++) {
					cnt[arr[i]]++;
				}
				
				for(int i = 1 ; i < cnt.length; i++) {
					cnt[i] += cnt[i - 1];
				}
				
				int[] sortArr = new int[N];
				for(int i = N - 1; i >= 0; i--) {
					sortArr[--cnt[arr[i]]] = arr[i];
				}
				List<Integer> list = new ArrayList<>();
				list.add(3);
				
				System.out.println(Arrays.toString(sortArr));
				
	}
}

