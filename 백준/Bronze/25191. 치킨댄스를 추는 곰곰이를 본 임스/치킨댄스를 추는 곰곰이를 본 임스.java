import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int chicken = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int coke = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        if (coke / 2 + beer < chicken) {
            System.out.println(coke / 2 + beer);
        } else {
            System.out.println(chicken);
        }
    }   
}
