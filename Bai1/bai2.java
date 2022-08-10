package btvnbuoi1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        do {
            System.out.print("Nhap a:");
            a = scanner.nextInt();
            System.out.print("Nhap b:");
            b = scanner.nextInt();
            System.out.print("Nhap c:");
            c = scanner.nextInt();
        } while (a <= 0 || b <= 0 || c <= 0);
        if (a + b > c && b + c > a && a + c > b ) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.print("La tam giac vuonh");
            }
            else if (a == b && b == c) {
                System.out.print("Tam giac deu");
            }
            else if (a == b || b == c) {
                System.out.print("Tam giac can");
            }else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b) {
                System.out.print("tam giac tu");
            }else System.out.print("tam giac thuong");

        } else System.out.print("Khong phai la tam giac");
    }
}
