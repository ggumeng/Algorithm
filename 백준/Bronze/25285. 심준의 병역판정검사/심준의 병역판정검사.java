import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int cm = Integer.parseInt(st.nextToken());
            int kg = Integer.parseInt(st.nextToken());

            double bmi = kg / ((cm * 0.01) * (cm * 0.01));

            boolean isCheckBmi = cm >= 159 && cm < 204;

            boolean first = cm >= 161 && cm < 204 && bmi >= 20 && bmi < 25;
            boolean second = cm >= 161 && cm < 204 && ((bmi >= 18.5 && bmi < 20) || (bmi >= 25 && bmi < 30));
            boolean third = (cm >= 159 && cm < 161 && bmi >= 16 && bmi < 35) || (cm >= 161 && cm < 204 && ((bmi >= 16 && bmi < 18.5) || (bmi >= 30 && bmi < 35)));

            if (isCheckBmi) {
                if (first) {
                    bw.write("1\n");
                } else if (second) {
                    bw.write("2\n");
                } else if (third) {
                    bw.write("3\n");
                } else {
                    bw.write("4\n");
                }
            } else {
                if (cm >= 146) {
                    bw.write("4\n");
                } else if (cm >= 140.1) {
                    bw.write("5\n");
                } else {
                    bw.write("6\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }   
}