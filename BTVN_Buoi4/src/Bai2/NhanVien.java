package Bai2;

import java.util.Scanner;

public class NhanVien {
    private static Scanner scanner=new Scanner(System.in);
    private static int temp=1;
    private int Manv;
    private String name;
    private int age;
    private String address;
    private String bophan;

    public NhanVien(String ten, int tuoi, String diachi, String job){
        Manv=temp++;
        this.name=ten;
        if (tuoi>0){
            this.age=tuoi;
        }else {
            this.age=1;
        }

        this.address=diachi;
        this.bophan=job;
    }
    public void xuat(){
        System.out.printf("%-10d%-10s%-10d%-10s%-10s\n",Manv,name,age,address,bophan);
    }

    public static void main(String[] args) {
        System.out.println("       THONG TIN CAC NHAN VIEN    ");
        NhanVien nv1=new NhanVien("mot",20,"hanoi","CNTT");
        NhanVien nv2=new NhanVien("hai", 21, "thaibinh", "QLI");
        NhanVien nv3 =new NhanVien("ba",23,"namdinh","CNTT");
        NhanVien nv4=new NhanVien("bon",24,"hanoi", "QLI");
        NhanVien nv5=new NhanVien("nam", 25, "thaininh","CNTT");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","MaNV","ten","tuoi","diachi","bophan");
        nv1.xuat();
        nv2.xuat();
        nv3.xuat();
        nv4.xuat();
        nv5.xuat();
    }
}
