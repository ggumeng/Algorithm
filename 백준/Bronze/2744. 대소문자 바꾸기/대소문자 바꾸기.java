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
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        String keyword = bf.readLine();

        for (int i=0; i<keyword.length(); i++) {
            char keywordChar = keyword.charAt(i);

            if (Character.isLowerCase(keywordChar)) {
                bw.write(Character.toUpperCase(keywordChar));
            } else {
                bw.write(Character.toLowerCase(keywordChar));
            }
        }
        
        bw.flush();
        bw.close();
    }
}