import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine()); // 전체 갯수

        for(int i = 0; i < n; i++) {
            // StringTokenizer st = new StringTokenizer(bf.readLine());

            String keyword = bf.readLine();

            String[] arr = keyword.split("");
            List<String> arr2 = new ArrayList<String>();

            for (int j=0; j < arr.length; j++) {
                if (j == 0) {
                    arr2.add(arr[j]);
                } else if (!arr[j].equals(arr[j-1])) {
                    arr2.add(arr[j]);
                } else {
                    continue;
                }
            }

            for (String res : arr2) {
                bw.write(res);
            }

            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}