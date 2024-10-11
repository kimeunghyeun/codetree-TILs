import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int Am = sc.nextInt(), Ae = sc.nextInt(), Bm = sc.nextInt(), Be = sc.nextInt();

        if (Am == Bm) {
            if (Ae >= Be) {
                System.out.print("A");
            } else { 
                System.out.print("B");
            }
        } else if (Am > Bm) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
    }
}