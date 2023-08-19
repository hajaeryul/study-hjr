package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj10773_제로 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int K = Integer.parseInt(br.readLine());
            Stack<Integer> money = new Stack<>();
            int sum = 0;
            for(int i = 0; i < K; i++) {
                int N = Integer.parseInt(br.readLine());
                if(N != 0) {
                    sum += N;
                    money.push(N);
                } else {
                    sum -= money.peek();
                    money.pop();
                }
            }
            System.out.println(sum);
    }
}
