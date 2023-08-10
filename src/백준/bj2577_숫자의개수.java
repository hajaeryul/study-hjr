package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2577_숫자의개수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        int[] cnt = new int[10];
        String mult = Integer.toString(A * B * C);
        
        for(int i = 0; i < mult.length(); i++) {
            cnt[mult.charAt(i)-'0']++;
        }
        
        for(int a : cnt) {
            System.out.println(a);
        }
    }
}
