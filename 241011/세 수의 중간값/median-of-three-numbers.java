import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 z작성해주세요.
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        if (a < b && b < c) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }



    }
}