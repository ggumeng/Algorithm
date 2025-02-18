import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int price = 0;
        
        if (a==b && a==c && b==c){
            price = 10000 + a*1000;
        } else {
            if (a==b){
                price = 1000 + a*100;
            } else if (b==c){
                price = 1000 + b*100;
            } else if (a==c) {
                price = 1000 + a*100;
            } else {
                if (a>b && a>c){
                    price = a*100;
                } else if (b>a && b>c){
                    price = b*100;
                } else {
                    price = c*100;
                }
            }
        }
        
        System.out.println(price);
        
    }
}