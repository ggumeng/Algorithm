import java.util.Scanner;

public class Main {
    public static void solution() {
        //솔루션 코드 작성
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);
        sc.close();
    }
    public static void main(String[] args) {
        solution();
    }
}