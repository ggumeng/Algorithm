import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int tiger = 0;
        int lion = 0;

        for (int i = 0; i < 9; i++) {
            if (bf.readLine().equals("Tiger")) {
                tiger += 1;
            } else {
                lion += 1;
            }
        }

        if (tiger > lion) {
            System.out.println("Tiger");
        } else {
            System.out.println("Lion");
        }
    }   
}