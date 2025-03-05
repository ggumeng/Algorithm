import java.io.*;
// import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        for (int i=0; i<testCase; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            StringBuilder sb = new StringBuilder();

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int roomNumber = 1;

            while (n > h) {
                n = n - h;
                roomNumber++;
            }

            int floorNumber = n == 0 ? 1 : n;

            sb.append(floorNumber);
            sb.append(roomNumber < 10 ? "0" + roomNumber : roomNumber);
            sb.append("\n");

            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
    }
    
}