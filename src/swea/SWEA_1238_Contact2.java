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

public class SWEA_1238_Contact2 {
    static List<Integer>[] list;
    static Queue<Integer> q;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            list = new ArrayList[101];
            for (int i = 1; i < 101; i++) {
                list[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < input / 2; i++) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list[a].add(b);
            }// 인접리스트에 입력 완료
            
//            System.out.println(Arrays.toString(list));
            max = bfs(start);
            System.out.println("#" + tc + " " + max);
        } // tc
    }

    static int bfs(int start) {
        boolean[] chk = new boolean[101];
        q = new LinkedList<>();
        chk[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int size = q.size(); // q를 poll하면 size가 바뀌어서.. 이거 찾느라 개고생함진짜
            max = 0;
            for (int i = 0; i < size; i++) {
                int x = q.poll();
                max = Math.max(max, x);

                for (int next : list[x]) {
                    if (!chk[next]) {
                    	chk[next] = true;
                        q.add(next);
                    }
                }
            }
        }

        return max;
    }
}