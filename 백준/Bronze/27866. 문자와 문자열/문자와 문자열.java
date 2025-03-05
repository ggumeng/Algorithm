import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //솔루션 코드 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String keyword = bf.readLine();
        int index = Integer.parseInt(bf.readLine());

        System.out.println(keyword.charAt(index - 1));
    }
}