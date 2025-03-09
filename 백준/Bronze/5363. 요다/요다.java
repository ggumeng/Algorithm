import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCase = Integer.parseInt(bf.readLine());

        for (int i=0; i<testCase; i++) {
            String[] splitArr = bf.readLine().split(" ");

            for (int j=2; j<splitArr.length; j++) {
                bw.write(splitArr[j] + " ");
            }

            bw.write(splitArr[0] + " ");
            bw.write(splitArr[1] + " \n");
        }

        bw.flush();
        bw.close();
    }   
}