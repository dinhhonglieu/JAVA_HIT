package Bsi1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

    public static Scanner scanner=new Scanner(System.in);
    public static  ArrayList<CongNhan> listCn = new ArrayList<>();
    public static ArrayList<KySu> listKysu=new ArrayList<>();
    public static ArrayList<NhanVien> listNhanVien=new ArrayList<>();
    static int chose;
    public static int dem=0;
    public static void main(String[] args) {

        do{
            System.out.println("1: Add 1 cán bộ vào List tương ứng\n" +
                    "2: Hiển thị danh sách các cán bộ\n" +
                    "3: Xóa 1 cán bộ theo id\n" +
                    "4: Tìm kiếm 1 cán bộ theo id\n" +
                    "5: Dừng chương trình\n");
            System.out.print("Nhap lua chon cua ban:");
            chose=scanner.nextInt();
            scanner.nextLine();
            switch (chose){
                case 1:
                    add();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    System.out.println("chúng ta dừng lại ở đây thôi");
                    break;
            }
        }while(chose!=5);
    }
//    1.Add 1 can bo vao List
    public static void add(){

        System.out.println("Lua chọn cán bộ cần thêm");
        System.out.println("1:cong nhan");
        System.out.println("2:Nhan vien");
        System.out.println("3:Ky su");
        int n=scanner.nextInt();
        scanner.nextLine();
        switch (n){
            case 1:
                System.out.println("1:cong nhan");
                CongNhan cn =new CongNhan();
                cn.input();
                listCn.add(cn);
                break;
            case 2:
                System.out.println("2:Nhan vien");
                NhanVien nv=new NhanVien();
                nv.input();
                listNhanVien.add(nv);
                break;
            case 3:
                System.out.println("3:Ky su");
                KySu ks=new KySu();
                ks.input();
                listKysu.add(ks);
                break;
        }
        dem++;
        }



//2.Hien thi
    public static void hienThi(){
        if(dem!=0){
            System.out.println("Danh sách cán bộ là:");
            if(listKysu.size()!=0){
                System.out.println("----Danh sách kĩ sư-------");
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","Nganh");
                for (int i = 0; i <listKysu.size() ; i++) {
                    listKysu.get(i).output();
                }
            }
            else System.out.println("Danh sach ky su trong");
            if (listCn.size()!=0){
                System.out.println("----Danh sách công nhân------ ");
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","cap bac");
                for (int i = 0; i < listCn.size(); i++) {
                    listCn.get(i).output();
                }
            }else System.out.println("Danh sách công nhân trống");

            if (listNhanVien.size()!=0){
                System.out.println("Danh sach nhan vien: ");
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","Cong viec");
                for (int i = 0; i < listNhanVien.size(); i++) {
                    listNhanVien.get(i).output();
                }
            }else System.out.println("Danh sách nhân viên trống");
        }
        else     System.out.println("Danh sach cán bộ rỗng");

    }

//3.xoa 1 can bo theo id
    public static void xoa(){
        int dem2=0;
        if(dem!=0){
            System.out.print("Nhap id 1 can bo can xoa:");
            int idxoa=scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < listNhanVien.size(); i++) {
                if(idxoa==listNhanVien.get(i).getId()){
                    listNhanVien.remove(i);
                    dem2++;
                    if(listNhanVien.size()==0) System.out.println("HẾT THẬT RỒI");
                   else {
                        System.out.println("Danh sach nhan vien con lai");
                        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","Cong viec");
                        for (int j = 0; j < listNhanVien.size(); i++) {
                            listNhanVien.get(i).output();

                        }
                    }

                }
            }


            for (int i = 0; i < listCn.size(); i++) {
                if (idxoa==listCn.get(i).getId()){
                    listCn.remove(i);
                    dem2++;
                    if (listCn.size()==0) System.out.println("HET ROI HET THAT ROI");
                    else {
                        System.out.println("Danh sach cong nhan con lai sau khi xoa");
                        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","cap bac");
                        for (int j = 0; j <listCn.size() ; i++) {
                            listCn.get(j).output();
                        }
                    }
                }
            }

            for (int i = 0; i < listKysu.size(); i++) {
                if (idxoa==listKysu.get(i).getId()){
                    listKysu.remove(i);
                    dem2++;
                    if (listKysu.size()==0) System.out.println("HẾT SẠCH RỒI Ạ");
                    else {
                        System.out.println("Danh sách kỹ sư còn lại sau khi xóa");
                        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","Nganh");
                        for (int j = 0; j < listKysu.size(); j++) {
                            listKysu.get(j).output();
                        }
                    }
                }
            }

        if (dem2==0) System.out.println("Khong co id nào ạ");
        }else System.out.println("Danh sách cán bộ rỗng");
    }
//4.Tim kiesmem  1 cán bộ theo id
    public static void timKiem(){
        int dem3=0;
        if (dem!=0){
            System.out.print("Nhap id bạn muốn tìm:");
            int idtim=scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < listCn.size(); i++) {
                if(idtim==listCn.get(i).getId()) {
                    System.out.println("Thông tin cán bộ cần tìm ");
                    System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","cap bac");
                    listCn.get(i).output();
                    dem3++;
                }
            }
            for (int i = 0; i < listKysu.size(); i++) {
                if (idtim==listKysu.get(i).getId()){
                    System.out.println("Thông tin cán bộ vừa tìm ");
                    System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","Nganh");
                    listKysu.get(i).output();
                    dem3++;
                }
            }
            for (int i = 0; i < listNhanVien.size(); i++) {
                if (idtim==listNhanVien.get(i).getId()){
                    System.out.println("Thông tin cán bộ vừa tìm");
                    System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","id","hoten","náminh","gioitinh","dia chi","Cong viec");
                    listNhanVien.get(i).output();
                    dem3++;
                }
            }
            if (dem3==0) System.out.println("Không có mã id như này ạ");
        }
        System.out.println("Danh sách casn bộ rỗng");
    }

}
