import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        

        int n = Integer.parseInt(bf.readLine());

        String[] tSize = bf.readLine().split(" ");

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int sum = 0;

        // 티셔츠 사이즈 => n / t + n % t
        for (int i=0; i<tSize.length; i++) {
            // Integer.parseInt(tSize[i]) => 해당 사이즈 숫자
            int size = Integer.parseInt(tSize[i]);
            
            // t => 티셔츠 묶음갯수
            sum += size % t > 0 ? size / t + 1 : size / t;
        }
        
        bw.write(sum + "\n");

        // 펜 묶음 => n / p , 한 자루씩 => n % p
        bw.write(n / p + " " + n % p);


        bw.flush();
        bw.close();
    }
    
}