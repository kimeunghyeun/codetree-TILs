import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char Asysmtom = sc.next().charAt(0);
        int At = sc.nextInt();

        char Bsysmtom = sc.next().charAt(0);
        int Bt = sc.nextInt();

        char Csysmtom = sc.next().charAt(0);
        int Ct = sc.nextInt();

        if (Asysmtom == 'Y' && At >= 37) {
            if ((Bsysmtom == 'Y' && Bt >= 37) || (Csysmtom == 'Y' && Ct >= 37)){
                System.out.print('E');
            } else {
                System.out.print('N');
            }
        } else {
            if ((Bsysmtom == 'Y' && Bt >= 37) && (Csysmtom == 'Y' && Ct >= 37)){
                System.out.print('E');
            } else {
                System.out.print('N');
            }
        }

    }
}