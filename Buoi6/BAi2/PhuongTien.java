package BAi2;

import java.util.Scanner;

public class PhuongTien {
    Scanner scanner=new Scanner(System.in);
    private String tenChu;
    private int loaiXe;
    private int dungTich;
    private int triGia;
    private float thue;

    public PhuongTien() {
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

    public int getTriGia() {
        return triGia;
    }

    public void setTriGia(int triGia) {
        this.triGia = triGia;
    }

    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
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
        triGia=scanner.nextInt();
        scanner.nextLine();
        if (triGia<100){
           thue=(triGia*2)/100;
        } else if (triGia<200){
            thue=(triGia*6)/100;
        } else {
          thue=(triGia*10)/100;
        }

    }
    public void output(){
        System.out.printf("%-10d%-15s%-15d%-20d%-15f\n",loaiXe,tenChu,dungTich,triGia,thue);
    }
    @Override
    public String toString(){
        return "loai xe"+this.loaiXe+"ten chu"+this.tenChu+"dung tich"+this.dungTich+"Gia tri xe"+this.triGia+"thue"+this.thue;
    }

}
