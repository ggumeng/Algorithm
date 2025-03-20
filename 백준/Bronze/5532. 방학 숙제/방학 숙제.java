import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(bf.readLine());

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());

        int korean = a/c;
        int math = b/d;

        if (a%c > 0) korean += 1;
        if (b%d > 0) math += 1;

        System.out.println(l - Math.max(korean, math));
    }   
}