import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (number == 1) continue;

            for (int j=2; j<=number; j++) {
                if (j == number) {
                    sum++;
                    break;
                }

                if (number % j == 0) { break; }
            }

        }

        System.out.println(sum);

        // bw.flush();
        // bw.close();
    }
    
}