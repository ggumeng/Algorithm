import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (Integer.parseInt(st.nextToken()) % Integer.parseInt(st.nextToken()) > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}