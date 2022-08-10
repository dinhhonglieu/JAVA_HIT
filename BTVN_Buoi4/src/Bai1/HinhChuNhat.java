package Bai1;

import java.util.Scanner;

public class HinhChuNhat {
    private float dai;
    private float rong;
    public HinhChuNhat()
    {
//        this.dai=chieudai;
//        this.rong=chieurong;
    }
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        dai=scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        rong= scanner.nextFloat();
        scanner.nextLine();
    }
    public void xuat(){
        System.out.println("chieu dai: "+dai);
        System.out.println("Chieu rong: "+rong);
    }
    public float chuVi(){
        return (dai+rong)*2;
    }
    public float dienTich(){
        return dai*rong;
    }

    public static void main(String[] args) {
        HinhChuNhat a=new HinhChuNhat();
        HinhChuNhat b=new HinhChuNhat();
        System.out.println("hinh chu nhat a");
        a.nhap();
        a.xuat();
        System.out.println("Chu vi hinh chu nhat a: "+a.chuVi());
        System.out.println("dien tich hinh chu nhat a: "+a.dienTich());

        System.out.println("hinh chu nhat b");
        b.nhap();
        b.xuat();
        System.out.println("Chu vi hinh chu nhat b: "+b.chuVi());
        System.out.println("dien tich hinh chu nhat b: "+b.dienTich());
        if(a.dienTich() > b.dienTich()){
            System.out.println("Hinh chu nhat a co dien tich lon hon");
        }else System.out.println("Hinh chu nhat b co dien tich lon hon");
    }
}
