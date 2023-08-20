package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10799_쇠막대기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Stack<Character> pipe = new Stack<>();
            String str = br.readLine();
            int sum = 0;
            
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(') {
                    pipe.push(str.charAt(i));
                } else {
                    if(str.charAt(i-1) == '(') {
                        pipe.pop();                        
                        sum += pipe.size();
                    } else {
                        pipe.pop();
                        sum++;
                    }
                }
            }
            System.out.println(sum);
    }
}