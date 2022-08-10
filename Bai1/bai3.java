package btvnbuoi1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("nhap n:");
        n = scanner.nextInt();
        int i,  tong = 0;
        for (i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                tong+=i;
            }
        }
        System.out.print("tong la: =" + tong);

    }
}
