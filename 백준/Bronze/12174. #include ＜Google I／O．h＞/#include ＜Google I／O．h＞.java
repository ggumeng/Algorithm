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

        int testCaseCnt = Integer.parseInt(st.nextToken());

        for (int i=0; i < testCaseCnt; i++) {
            int byteCnt = Integer.parseInt(bf.readLine());
            String testCase = bf.readLine().replace("I", "1").replace("O", "0");

            StringBuilder result = new StringBuilder();
            
            for (int j=0; j < byteCnt * 8; j += 8) {
                String byteString = testCase.substring(j, j + 8);
                int asciiValue = Integer.parseInt(byteString, 2);
                result.append((char)asciiValue);
            }

            bw.write("Case #" + (i + 1) + ": " + result.toString() + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}