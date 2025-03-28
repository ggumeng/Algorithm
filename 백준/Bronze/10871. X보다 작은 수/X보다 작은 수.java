import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int j=0; j<n; j++){
            if (a[j] < x){
                bw.write(a[j] + " ");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}