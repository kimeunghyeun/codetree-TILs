import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int gender = sc.nextInt(), age = sc.nextInt();

        if (gender == 1) {
            if (age >= 19) {
                System.out.print("WOMAN");
            } else {
                System.out.print("GIRL");
            }
        } else if(gender == 0) {
            if (age >= 19) {
                System.out.print("MAN");
            } else {
                System.out.print("BOY");
            }
        }
    }
}