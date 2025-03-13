import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 세 줄은 사과의 득점
        int sumA = 3 * Integer.parseInt(bf.readLine()) + 2 * Integer.parseInt(bf.readLine()) + Integer.parseInt(bf.readLine());
        // 다음 세 줄은 바나나의 득점
        int sumB = 3 * Integer.parseInt(bf.readLine()) + 2 * Integer.parseInt(bf.readLine()) + Integer.parseInt(bf.readLine());

        // 3 , 2 , 1
        if (sumA > sumB) {
            System.out.println("A");
        } else if (sumA < sumB) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }   
}
