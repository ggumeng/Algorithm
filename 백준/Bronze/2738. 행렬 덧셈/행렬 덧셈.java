import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // N, M
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        // A - N, M
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            
            for (int j=0; j<m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // B - N,M
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            
            for (int j=0; j<m; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                bw.write(a[i][j] + b[i][j] + " ");
            }

            bw.write("\n");
        }
        
        
        bw.flush();
        bw.close();
    }
}