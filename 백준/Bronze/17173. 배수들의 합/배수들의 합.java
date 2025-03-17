import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();

        st = new StringTokenizer(bf.readLine());

        while (m-- > 0) {
            int k = Integer.parseInt(st.nextToken());

            int temp = k;
            int num = 1;

            while (true) {
                temp = k * num;

                if (temp > n) break;

                arr.add(temp);
                num++;
            }
        }

        Set<Integer> setArr = new HashSet<>(arr);

        int sum = 0;

        for (Integer integer : setArr) {
            sum += integer;
        }

        System.out.println(sum);
    }   
}
