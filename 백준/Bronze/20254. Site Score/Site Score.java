import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 56, 24, 14, 6
        int ur = 56 * Integer.parseInt(st.nextToken());
        int tr = 24 * Integer.parseInt(st.nextToken());
        int uo = 14 * Integer.parseInt(st.nextToken());
        int to = 6 * Integer.parseInt(st.nextToken());
        
        System.out.println(ur + tr + uo + to);
    }   
}