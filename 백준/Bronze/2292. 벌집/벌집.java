import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(bf.readLine());

        int count = 1;
        int start = 1;

        while(true) {
            // 1 -> 7 -> 19 -> 37
            if (n <= start) {
                System.out.println(count);
                break;
            }

            start += count * 6;

            count++;
        }
        // bw.flush();
        // bw.close();
    }
    
}