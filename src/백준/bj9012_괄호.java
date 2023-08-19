package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj9012_괄호 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            Stack<Character> bracket = new Stack<>(); 
            String str = br.readLine();
            boolean flag = true;
            l:
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(') {
                    bracket.push(str.charAt(i));
                } else {
                    if(bracket.isEmpty()) {
                        flag = false;
                        break l;
                    } else {
                        bracket.pop();
                    }
                }
            }
            if(bracket.isEmpty() && flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
