import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a - 1;
        int d = b + 15;
        int e = b - 45;

        if (b >= 45 && 60 > b) {
            System.out.print(a + " " + e);
        } else if (45 > b) {
            if (24 > a && a > 0) {
                System.out.print(c + " " + d);
            } else if (a == 0) {
                System.out.print("23" + " " + d);
            }
        }
    }
}
