import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int len = Integer.parseInt(br.readLine());
        
        String n = br.readLine();

        for (int i=0; i<len; i++){
            sum += Integer.parseInt(n.substring(i, i+1));
        }

        System.out.println(sum);

    }
}
