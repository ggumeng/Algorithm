import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
            int t = Integer.parseInt(br.readLine());
            StringTokenizer st;
        
            for (int i=0; i<t; i++){
                st = new StringTokenizer(br.readLine(), " ");
                bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
            }
            
            br.close();
            
            bw.flush();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
}