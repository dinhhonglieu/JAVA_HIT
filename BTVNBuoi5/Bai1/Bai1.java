package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static Scanner scanner=new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy quanLy= new QuanLy();
    private Mayy May = new Mayy();

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(QuanLy quanLy) {
        this.quanLy = quanLy;
    }

    public Mayy getMay() {
        return May;
    }

    public void setMay(Mayy may) {
        May = may;
    }

    public void nhap(){
        System.out.print("Nhap ma phong: ");
        maPhong=scanner.nextLine();
        System.out.print("ten phong: ");
        tenPhong=scanner.nextLine();
        System.out.print("dien tich: ");
        dienTich=scanner.nextFloat();
        scanner.nextLine();
        quanLy.nhap();
        May.nhap();
    }

    public void xuat(){
        System.out.println("ma phong: "+maPhong);
        System.out.println("ten phong: "+tenPhong);
        System.out.println("dien tich: "+dienTich);
        quanLy.xuat();
        May.xuat();
    }

    public static void main(String[] args) {
        Bai1 Phong1 = new Bai1();
        Phong1.nhap();
        Phong1.xuat();
    }
}
