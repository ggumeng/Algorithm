import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(bf.readLine());
        String m = bf.readLine();

        long sum = 0;

        for (int i=0; i<l; i++) {
            int alpha = Character.getNumericValue(m.charAt(i)) - 9;

            sum += alpha * Math.pow(31, i);
        }

        System.out.println(sum);

        // bw.flush();
        // bw.close();
    }
    
}