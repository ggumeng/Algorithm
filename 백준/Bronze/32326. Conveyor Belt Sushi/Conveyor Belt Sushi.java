import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 빨간접시 = 3, 초록접시 = 4, 파란접시 = 5
        int redCost = 3 * Integer.parseInt(bf.readLine());
        int greenCost = 4 * Integer.parseInt(bf.readLine());
        int blueCost = 5 * Integer.parseInt(bf.readLine());

        System.out.println(redCost + greenCost + blueCost);
    }
}