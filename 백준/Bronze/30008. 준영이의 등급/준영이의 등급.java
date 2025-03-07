import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int studentCount = Integer.parseInt(st.nextToken());
        int subjectCount = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<subjectCount; i++) {
            // 백분율 = 등수 * 100 / 학생수
            int percent = Integer.parseInt(st.nextToken()) * 100 / studentCount;

            if (percent <= 4) {
                bw.write(1 + " ");
            } else if (percent <= 11) {
                bw.write(2 + " ");
            } else if (percent <= 23) {
                bw.write(3 + " ");
            } else if (percent <= 40) {
                bw.write(4 + " ");
            } else if (percent <= 60) {
                bw.write(5 + " ");
            } else if (percent <= 77) {
                bw.write(6 + " ");
            } else if (percent <= 89) {
                bw.write(7 + " ");
            } else if (percent <= 96) {
                bw.write(8 + " ");
            } else {
                bw.write(9 + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
