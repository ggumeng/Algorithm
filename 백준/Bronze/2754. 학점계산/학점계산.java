import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        /**
         * A+: 4.3, A0: 4.0, A-: 3.7
         * B+: 3.3, B0: 3.0, B-: 2.7
         * C+: 2.3, C0: 2.0, C-: 1.7
         * D+: 1.3, D0: 1.0, D-: 0.7 
         * F: 0.0 
        */
        String grade = bf.readLine();
        int point = 0;

        if (grade.equals("F")) {
            System.out.println("0.0");
        } else {
            switch (grade.charAt(0)) {
                case 'A':
                    point = 4;
                    break;
                case 'B':
                    point = 3;
                    break;
                case 'C':
                    point = 2;
                    break;
                case 'D':
                    point = 1;
                    break;
                default:
                    break;
            }
    
            switch (grade.charAt(1)) {
                case '+':
                    System.out.println(point + ".3");
                    break;
                case '0':
                    System.out.println(point + ".0");
                    break;
                case '-':
                    System.out.println((point - 1) + ".7");
                    break;
                default:
                    break;
            }
        }
        // bw.flush();
        // bw.close();
    }
}