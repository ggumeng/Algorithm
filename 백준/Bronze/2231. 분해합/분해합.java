import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = bf.readLine();
        int x = Integer.parseInt(n);

        for (int i=x-(n.length() * 9); i<=x-n.length(); i++) {
            int sum = 0;

            for (int j=0; j<Integer.toString(i).length(); j++) {
                sum += Character.getNumericValue(Integer.toString(i).charAt(j));
            }

            if (sum + i == x) {
                System.out.println(i);
                break;
            } else if (i == x - n.length()) {
                System.out.println(0);
                break;
            }
        }


        // bw.flush();
        // bw.close();
    }
    
}