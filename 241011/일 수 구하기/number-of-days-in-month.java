import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (((n <= 7) && n % 2 == 1) || n == 8 || (n >= 9 && n % 2 == 0) ) {
            System.out.print(31);
        } else if(n == 2) {
            System.out.print(28);
        } else {
            System.out.print(30);
        }
    }
}