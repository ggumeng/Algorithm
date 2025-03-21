import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++) {
            String year = bf.readLine();

            int end = Integer.parseInt(year.substring(2, 4));

            if ((Integer.parseInt(year) + 1) % end == 0) {
                bw.write("Good\n");
            } else {
                bw.write("Bye\n");
            }
        }

        bw.flush();
        bw.close();
    }   
}