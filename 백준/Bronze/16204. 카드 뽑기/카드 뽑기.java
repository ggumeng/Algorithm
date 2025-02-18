import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // O 갯수
        int k = Integer.parseInt(st.nextToken()); // O 를 적으려고 하는 숫자
        
        int xCount = n - m; // X 갯수
        int xWriteCount = n - k; // X 를 적으려고 하는 숫자

        int minO = Math.min(m, k);
        int minX = Math.min(xCount, xWriteCount);

        bw.write(String.valueOf(minO + minX));

        bw.flush();
        bw.close();
    }
}