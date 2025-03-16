import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] splitArr = bf.readLine().split(" ");

            int x = Integer.parseInt(splitArr[0]);
            int y = Integer.parseInt(splitArr[2]);

            int calc = 0;

            if (splitArr[1].equals("-")) {
                calc = x - y;
            } else {
                calc = x + y;
            }

            if (Integer.parseInt(splitArr[4]) == calc) {
                bw.write("Case " + (i + 1) + ": YES\n");
            } else {
                bw.write("Case " + (i + 1) + ": NO\n");
            }
        }

        bw.flush();
        bw.close();
    }   
}