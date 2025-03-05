import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = bf.readLine().split(" ");

        boolean isAsc = true;
        boolean isDesc = true;

        for (int i=0; i<8; i++) {
            if (i == 7) {
                break;
            }

            int a = Integer.parseInt(arr[i]);
            int b = Integer.parseInt(arr[i+1]);

            if (a < b) {
                // asc
                isDesc = false;
            } else {
                // desc
                isAsc = false;
            }
        }

        if (isAsc) {
            bw.write("ascending");
        } else if (isDesc) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
    }
    
}