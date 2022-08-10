package Bai1;

import java.util.Scanner;

public class Mayy {
    public static Scanner scanner=new Scanner(System.in);
    private String maMay,kieuMay,tinhTrang;

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void nhap(){
        System.out.print("Nhap ma may: ");
        maMay=scanner.nextLine();
        System.out.print("Kieu may: ");
        kieuMay=scanner.nextLine();
        System.out.print("tinh trang may: ");
        tinhTrang=scanner.nextLine();
    }
    public void xuat(){
        System.out.println("ma may: "+maMay);
        System.out.println("Kieu may :"+maMay);
        System.out.println("tinh trang may: "+tinhTrang);
    }
}
