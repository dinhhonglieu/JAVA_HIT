package Bai1;

import java.util.Scanner;

public class QuanLy {
    private static Scanner scanner=new Scanner(System.in);
    private String maQL;
    private String hoTen;

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void nhap(){
        System.out.print("Nhap ma quan ly: ");
        maQL=scanner.nextLine();
        System.out.println();
        System.out.print("Ho va ten: ");
        hoTen=scanner.nextLine();
    }
    public void xuat(){
        System.out.println("ma QL:"+maQL);
        System.out.println("ho va ten: "+hoTen);
    }
}
