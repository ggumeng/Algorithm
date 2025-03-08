import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        for (int i=0; i<testCase; i++) {
            int count = Integer.parseInt(bf.readLine());

            int isWin1 = 0;
            int isWin2 = 0;

            for (int j=0; j<count; j++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());

                String player1 = st.nextToken();
                String player2 = st.nextToken();

                if (player1.equals("R")) {
                    if (player2.equals("R")) {
                        isWin1++;
                        isWin2++;
                    } else if (player2.equals("S")) {
                        isWin1++;
                    } else {
                        isWin2++;
                    }
                } else if (player1.equals("S")) {
                    if (player2.equals("R")) {
                        isWin2++;
                    } else if (player2.equals("S")) {
                        isWin1++;
                        isWin2++;
                    } else {
                        isWin1++;
                    }
                } else {
                    if (player2.equals("R")) {
                        isWin1++;
                    } else if (player2.equals("S")) {
                        isWin2++;
                    } else {
                        isWin1++;
                        isWin2++;
                    }
                }
            }

            if (isWin1 > isWin2) {
                bw.write("Player 1\n");
            } else if (isWin1 < isWin2) {
                bw.write("Player 2\n");
            } else {
                bw.write("TIE\n");
            }
        }


        bw.flush();
        bw.close();
    }   
}
