import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        // x = 좀비가 먹는 뇌의 수
        // y = 좀비가 생존하는 데 필요한 뇌의 수 
        // x >= y -> MMM BRAINS, else NO BRAINS
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x >= y) {
                bw.write("MMM BRAINS\n");
            } else {
                bw.write("NO BRAINS\n");
            }
        }

        bw.flush();
        bw.close();
    }   
}
