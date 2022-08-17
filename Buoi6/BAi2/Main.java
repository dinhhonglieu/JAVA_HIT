package BAi2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    static int chose;
    static int dem=0;
    static ArrayList<PhuongTien> xe=new ArrayList<>();
    public static void main(String[] args) {



        do{
            System.out.println("\n---MENU----\n");
            System.out.println("1.Nhập thông tin và tạo danh sách các xe \n"+
                    "2. Xuất bảng kê khai tiền thuế trước bạ của các xe. \n"
                    +"3. Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần\n"+
                    "4. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần\n"
                    +"5.Thoát");
            System.out.print("Moi nhap lua chon:");
            chose=scanner.nextInt();
            switch (chose){
                case 1:
                    input();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    thue();
                    break;
                case 4:
                    tang();
                    break;
                case 5:
                    System.out.println("HIHI di ngu thoi");
                    break;
            }
        }while(chose!=5);
    }
//    1.Nhập thông tin và tạo danh sách các xe
    public static void input(){
        PhuongTien x=new PhuongTien();
        int n;
        do{
            System.out.println("1.nhap  \n2.ket thuc");
            n=scanner.nextInt();
            switch (n){
                case 1:
                    x.input();
                    xe.add(x);
                    dem++;
                    break;
                case 2:
                    break;
            }
        }while (n!=2);

    }
//2/Hien thi
    public static void hienThi(){
        if (dem!=0){
        System.out.println("Danh sach xe ");
        for (int i = 0; i < xe.size(); i++) {
            System.out.printf("%-10s%-15s%-15s%-20s%-15s\n", "loaiXe","tenChu","dungTich","triGia","thue");
            xe.get(i).output();
        }
        }else System.out.println("Ban chua nhap cai xe nao");
    }
//    3 sap xep tang
    public static void thue(){
        if(dem!=0){
            for (int i = 0; i < xe.size()-1; i++) {
                for (int j = i+1; j <xe.size() ; j++) {
                    if(xe.get(i).getThue()>xe.get(j).getThue())
                        doicho(xe.get(i),xe.get(j));
                }
            }
            System.out.println("Sau khi sx");
            hienThi();
        }else System.out.println("Chưa Nhap danh sach");
    }
    public static void tang(){
        if (dem!=0){
            for (int i = 0; i < xe.size(); i++) {
                for (int j = i+1; j < xe.size() ; j++) {
                    if (xe.get(i).getTriGia()>xe.get(j).getTriGia()){
                        doicho(xe.get(i),xe.get(j));
                    }
                }
            }
            System.out.println("Sau khi sap xep");
            hienThi();
        }
    }
// doi cho
    public static void doicho(PhuongTien a, PhuongTien b){
        PhuongTien temp=new PhuongTien();

        temp.setLoaiXe(a.getLoaiXe());
        temp.setTenChu(a.getTenChu());
        temp.setDungTich(a.getDungTich());
        temp.setTriGia(a.getTriGia());
        temp.setThue(a.getThue());

        a.setLoaiXe(b.getLoaiXe());
        a.setTenChu(b.getTenChu());
        a.setDungTich(b.getDungTich());
        a.setTriGia(b.getTriGia());
        a.setThue(b.getThue());

        b.setLoaiXe(temp.getLoaiXe());
        b.setTenChu(b.getTenChu());
        b.setDungTich(b.getDungTich());
        b.setTriGia(temp.getTriGia());
        b.setThue(temp.getThue());



    }
}
