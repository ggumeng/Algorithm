import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 참가자의 수
        int participants = Integer.parseInt(bf.readLine());

        int winner = 0;

        for (int i=0; i<participants; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            // a * (d+g)
            int point = 0;

            int a = Integer.parseInt(st.nextToken());

            int dg = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            if (a == dg) {
                point = a * dg * 2;
            } else {
                point = a * dg;
            }

            winner = Math.max(winner, point);
        }
        
        System.out.println(winner);
    }   
}