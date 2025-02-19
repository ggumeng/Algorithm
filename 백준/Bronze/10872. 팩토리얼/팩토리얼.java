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
        // StringTokenizer st = new StringTokenizer(bf.readLine());

        int sum = 1;

        for (int i=Integer.parseInt(bf.readLine()); i>0; i--) {
            sum *= i;
        }

        bw.write(sum + "\n");
        
        bw.flush();
        bw.close();
    }
}