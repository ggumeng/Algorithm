import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String test = bf.readLine();

            if (Integer.parseInt(test) == 0) break;

            String reverseTest = new StringBuilder(test).reverse().toString();

            if (test.equals(reverseTest)) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
        bw.close();
    }   
}