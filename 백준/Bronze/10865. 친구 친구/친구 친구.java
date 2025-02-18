import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int studentCnt = Integer.parseInt(st.nextToken());
        int rowCnt = Integer.parseInt(st.nextToken());

        int[] arr = new int[studentCnt];

        for (int i = 0; i < rowCnt; i++) {
            st = new StringTokenizer(bf.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a - 1]++;
            arr[b - 1]++;
        }

        for (Integer res : arr) {
            bw.write(res + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}