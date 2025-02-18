import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();
        StringTokenizer st = new StringTokenizer(msg, " ");
        
        System.out.println(st.countTokens());
    }
}