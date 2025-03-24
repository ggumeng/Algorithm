import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        for (int i = 0; i < 8; i++) {
            String[] arr = bf.readLine().split("");
            
            for (int j = 0; j < arr.length; j++) {
                if (i%2 == 0) {
                    if (j%2 == 0 && arr[j].equals("F")) {
                        count++;
                    }
                } else {
                    if (j%2 != 0 && arr[j].equals("F")) {
                        count++;
                    }
                }
            }            
        }

        System.out.println(count);
    }   
}