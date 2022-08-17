package Buoi6.BAi2;

import java.util.Scanner;

public class PhuongTien {
    Scanner scanner=new Scanner(System.in);
    private String tenChu;
    private int loaiXe;
    private int dungTich;
    private double triGia;
    private double thue;

    public PhuongTien() {
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getTenChu() {
        return tenChu;
    }

    public void setTenChu(String tenChu) {
        this.tenChu = tenChu;
    }

    public int getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(int loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public void input() {
        System.out.print("Nhap ten loai xe:");
        loaiXe = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap chu xe:");
        tenChu = scanner.nextLine();
        System.out.print("Nhap dung tich:");
        dungTich = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Gia tri cua xe:");
        triGia= scanner.nextDouble();
        scanner.nextLine();
        if (dungTich<100){
           thue=(triGia*2)/100;
        } else if (dungTich<200){
            thue=(triGia*6)/100;
        } else {
          thue=(triGia*10)/100;
        }

    }
    public void output(){
        System.out.printf("%-10d%-15s%-15d%-20.2f%-15.2f\n",loaiXe,tenChu,dungTich,triGia,thue);
    }
    @Override
    public String toString(){
        return "loai xe"+this.loaiXe+"ten chu"+this.tenChu+"dung tich"+this.dungTich+"Gia tri xe"+this.triGia+"thue"+this.thue;
    }

}
