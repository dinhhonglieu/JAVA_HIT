package Bai3;

import java.util.Scanner;

public class GiaiPT {
    private int a, b, c;
    private double x, x1, x2,delta;
    public GiaiPT() {

    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        a = scanner.nextInt();
        System.out.print("nhap b: ");
        b = scanner.nextInt();
        System.out.print("nhap c: ");
        c = scanner.nextInt();
    }

    public void ketQua() {
        if (a == 0) {
            if(b==0 && c!=0) System.out.println("Phuong trinh vo nghiem");
            else {
                x = -(c / b);
                System.out.println("Phuong trinh co mot nghiem la:" +"x ="+ x);
            }
        } else {
            delta = (b * b) - 4 * a * c;
            if (delta == 0) {
                x = -b / (2 * a);
                System.out.println(" phuong trinh co nghiem kep : "+" x1 = x2 =" + x);
            }
            if (delta < 0) System.out.println("Phuong trinh vo nghiem");
            else {
                x1 = -(-b + Math.sqrt( delta)) / (2 * a);
                x2 = -(-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co 2 nghiem phan biet:" + "x1= "+x1 + " "+"x2= " + x2);
            }
        }
    }

    public static void main(String[] args) {
        GiaiPT PtBac2 =new GiaiPT();
        PtBac2.nhap();
        PtBac2.ketQua();
    }

}
