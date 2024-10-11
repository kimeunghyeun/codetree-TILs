import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 z작성해주세요.
        Scanner  sc = new Scanner(System.in);
        int Am = sc.nextInt(), Ae = sc.nextInt(), Bm = sc.nextInt(), Be = sc.nextInt();
        
        if (Am > Bm && Ae > Be) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

    }
}