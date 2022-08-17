package Buoi6.Bsi1;

import java.util.Scanner;

public class CanBo {
    protected int id;
    protected String hoten;
    protected int namsinh;
    protected String gioitinh;
   protected String diachi;
   private static int temp=1;
    public static Scanner scanner =new Scanner(System.in);

    public CanBo() {
        id=temp++;
    }

    public CanBo(int id, String hoten, int namsinh, String gioitinh, String diachi) {
        this.id = id;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void input(){
//        System.out.print("Nhap id: ");
//        id=scanner.nextInt();
//        scanner.nextLine();
        System.out.print("Nhap ten: ");
        hoten=scanner.nextLine();
        System.out.print("Nam sinh: ");
        namsinh=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Gioi tinh: ");
        gioitinh=scanner.nextLine();
        System.out.print("Dia chi: ");
        diachi=scanner.nextLine();
    }

    public void output(){
        System.out.printf("%-15d%-15s%-15d%-15s%-15s",id,hoten,namsinh,gioitinh,diachi);
    }
    @Override
    public String toString(){
        return "id sv: "+this.id+",ho ten: "+this.hoten+",Nam sinh:"+this.namsinh+",Gioi tinh"+this.gioitinh+",dia chi:"+this.diachi;
    }
}
