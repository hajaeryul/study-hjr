package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259_팰린드롬수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String str = br.readLine();
            String res = "yes";
            for(int i = 0; i < str.length() / 2; i++) {
                if(str.charAt(i) != str.charAt(str.length() -1 -i)) {
                    res = "no";
                }
            }
            if(Integer.parseInt(str) == 0) break;
            System.out.println(res);
        }
    }
}
