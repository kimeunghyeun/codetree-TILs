import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);

        if (n == 'S') {
            System.out.print("Superior");
        } else if (n == 'A') {
            System.out.print("Excellent");
        } else if (n == 'B') {
            System.out.print("Good");
        } else if (n == 'C') {
            System.out.print("Usually");
        } else if (n == 'D') {
            System.out.print("Effort");
        } else {
            System.out.print("Failure");
        }


    }
}