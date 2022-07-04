import java.util.Scanner;

public class Uoc_chung_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhập a:");
        a = scanner.nextInt();
        System.out.println("Nhập b:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có UCLN");
        }
        if (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                    b = b - a;
            }
        }System.out.println("UCLN là: " + a);
    }
}

