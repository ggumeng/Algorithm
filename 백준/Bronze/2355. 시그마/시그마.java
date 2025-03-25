import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long min = Math.min(a, b);
        long max = Math.max(a, b);

        System.out.println((max - min + 1) * (max + min) / 2);
    }   
}