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

        char Aresult, Bresult, Cresult;

        if (Asysmtom == 'Y') { 
            if (At >= 37) {
                Aresult = 'A';
            } else if (At < 37) {
                Aresult = 'C';
            }
        } else {
            if (At >= 37) {
                Aresult = 'B';
            } else {
                Aresult = 'D';
            }
        }
//--------------------------------------------------------
        if (Bsysmtom == 'Y') { 
            if (Bt >= 37) {
                Bresult = 'A';
            } else if (At < 37) {
                Bresult = 'C';
            }
        } else {
            if (Bt >= 37) {
                Bresult = 'B';
            } else {
                Bresult = 'D';
            }
        }
//--------------------------------------------------------
        if (Csysmtom == 'Y') { 
            if (Ct >= 37) {
                Cresult = 'A';
            } else if (At < 37) {
                Cresult = 'C';
            }
        } else {
            if (Ct >= 37) {
                Cresult = 'B';
            } else {
                Cresult = 'D';
            }
        }
//--------------------------------------------------------
//--------------------------------------------------------
        char list[] = {Aresult, Bresult, Cresult};
        int num;

        for (char e : list) {
            if (e == 'A') {
                num += 1;
            }
        }

        if (num >= 2) {
            System.out.print('E');
        } else {
            System.out.print('N');
        }
    }
}