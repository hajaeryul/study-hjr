package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
	static long lo, hi, mid;
    static int K, N;
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        K = Integer.parseInt(s.split(" ")[0]);
        N = Integer.parseInt(s.split(" ")[1]);

        arr = new long[K];
        long max = -1;
        for (int i = 0; i < K; i++) {
            arr[i] = Long.parseLong(br.readLine());
            if (arr[i] >= max) max = arr[i];
        }

        lo = 1;
        hi = max;
        long result = 0;

        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (check(mid)) {
                result = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(result);
    }

    static boolean check(long mid) {
        int count = 0;
        for (int i = 0; i < K; i++) {
            count += arr[i] / mid;
        }
        return count >= N;
    }
}
