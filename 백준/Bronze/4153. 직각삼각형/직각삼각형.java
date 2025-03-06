import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            // a*a + b*b = c*c
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            long max = 0;
            long sum = 0;

            if (a == 0 && b == 0 && c == 0) break;

            if (a > b && a > c) {
                max = a*a;
                sum = b*b + c*c;
            } else if (b > a && b > c) {
                max = b*b;
                sum = a*a + c*c;
            } else {
                max = c*c;
                sum = a*a + b*b;
            }

            if (max == sum) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }

        }

        bw.flush();
        bw.close();
    }
    
}