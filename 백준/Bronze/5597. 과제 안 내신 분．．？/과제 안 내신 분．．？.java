import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(bf.readLine());

        // 학생 30명, 특별과제 28명, 2명 안냄.
        int[] practiceDoneStudents = new int[28];

        for (int i=0; i<practiceDoneStudents.length; i++) {
            practiceDoneStudents[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(practiceDoneStudents);

        for (int i=1; i<=30; i++) {
            boolean result = false;

            for (int j=0; j<practiceDoneStudents.length; j++) {
                if (practiceDoneStudents[j] == i) {
                    result = true;
                    break;
                }
            }

            if (!result) bw.write(i + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}