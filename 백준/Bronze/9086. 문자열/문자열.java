import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(bf.readLine());

        for (int i=0; i<length; i++) {
            StringBuilder sb = new StringBuilder();
            String keyword = bf.readLine();

            sb.append(keyword.charAt(0));
            sb.append(keyword.charAt(keyword.length() - 1) + "\n");

            bw.write(sb.toString());
        }
        
        bw.flush();
        bw.close();
    }
}