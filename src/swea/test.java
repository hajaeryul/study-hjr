package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    static int K,N,count;
    static long lo,hi;
    static long mid = 1;
    static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        K = Integer.parseInt(s.split(" ")[0]);
        N = Integer.parseInt(s.split(" ")[1]);
        
        arr = new long[K];
        long max = -1;
        for(int i=0;i<K;i++) {
            arr[i]=Long.parseLong(br.readLine());
            if(arr[i]>=max) max = arr[i];
        }//입력 끝
        if(arr.length==1) {
            mid = arr[0]/K;
        }else {
            lo = 0;
            hi = max;
            while(lo <= hi) {
                mid = (lo + hi)/2;
                check(mid);
                if(count==N) break;
            }
            
        }
        System.out.println(mid);
        
    }//main
    static void check(long mid) {
        count = 0;
        for(int i=0;i<K;i++) {
            count += arr[i]/mid;
        }
        if(count>N) lo = mid;
        if(count==N) return;
        if(count<N) hi = mid;
    }

}
