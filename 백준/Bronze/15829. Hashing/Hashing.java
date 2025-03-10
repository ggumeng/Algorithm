import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(bf.readLine());
        String m = bf.readLine();

        BigInteger hash = new BigInteger("0");
        BigInteger r = new BigInteger("31");
        BigInteger mod = new BigInteger("1234567891");

        for (int i=0; i<l; i++) {
            BigInteger alpha = BigInteger.valueOf(Character.getNumericValue(m.charAt(i)) - 9);

            hash = hash.add(r.pow(i).mod(mod).multiply(alpha));
        }

        System.out.println(hash.mod(mod));

        // bw.flush();
        // bw.close();
    }
    
}