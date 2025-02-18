import java.util.Scanner;

public class Main {
    public static void solution() {
        //솔루션 코드 작성
        Scanner sc = new Scanner(System.in);
    
        int num = sc.nextInt();

        String str = "";

        for(int i = 1; i <= num/4; i++){
            str += "long ";
        }

        sc.close();
        System.out.println(str + "int");
    }
    public static void main(String[] args) {
        solution();
    }
}