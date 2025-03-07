import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Persepolis, Esteghlal, Penalty
        int homeP = Integer.parseInt(st.nextToken());
        int awayE = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        int homeE = Integer.parseInt(st.nextToken());
        int awayP = Integer.parseInt(st.nextToken());

        int totalP = homeP + awayP;
        int totalE = homeE + awayE;

        boolean winnerP = totalP > totalE || (totalE == totalP && awayP > awayE);
        boolean winnerE = totalE > totalP || (totalE == totalP && awayE > awayP);

        if (winnerP) {
            System.out.println("Persepolis");
        } else if (winnerE) {
            System.out.println("Esteghlal");
        } else {
            System.out.println("Penalty");
        }
    }
}