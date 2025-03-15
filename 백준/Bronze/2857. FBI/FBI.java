import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isExist = false;

        for (int i = 0; i < 5; i++) {
            if (bf.readLine().contains("FBI")) {
                bw.write(i+1 + " ");
                isExist = true;
            }
        }

        if (!isExist) {
            bw.write("HE GOT AWAY!");
        }
        
        bw.write("\n");

        bw.flush();
        bw.close();
    }   
}