import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] isMultiple = new boolean[n + 1]; // 비트마스크 대신 배열 사용
        st = new StringTokenizer(bf.readLine());

        while (m-- > 0) {
            int k = Integer.parseInt(st.nextToken());
            for (int i = k; i <= n; i += k) {
                isMultiple[i] = true;
            }
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isMultiple[i]) sum += i;
        }

        System.out.println(sum); // System.out.println()이 오히려 더 빠를 수 있음
    }
}
