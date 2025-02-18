import java.util.Scanner;

public class Main {
    public static void solution() {
        //솔루션 코드 작성
        Scanner sc = new Scanner(System.in);
    
        int total = sc.nextInt();
        int itemCount = sc.nextInt();
        int result = 0;

        for (int i=0; i < itemCount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result += a*b;
        }

        if (result == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
    public static void main(String[] args) {
        solution();
    }
}