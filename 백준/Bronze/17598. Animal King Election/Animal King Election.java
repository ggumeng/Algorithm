import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int winner = 0;

        for (int i = 0; i < 9; i++) {
            if (bf.readLine().equals("Tiger")) {
                winner++;
            }
        }

        if (winner >= 5) {
            System.out.println("Tiger");
        } else {
            System.out.println("Lion");
        }
    }   
}