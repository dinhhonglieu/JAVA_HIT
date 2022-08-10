package Bai2;

import java.util.Scanner;

public class Student {
    private static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private int age;
    private Address diaChi = new Address();
    Scanner scanner = new Scanner(System.in);
    //  private static int  temp=0;


    //    public Student() {
//        id=temp++;
//    }
    public int getId() {
        return id;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        diaChi = new Address();
        diaChi.input();
    }

    public void output() {
        System.out.println("Student's id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        diaChi.output();
    }

    public static void main(String[] args) {
        int n;

        System.out.print("Nhap mot mang n sinh vien: ");
        n = sc.nextInt();
        Student sv[] = new Student[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            sv[i].input();
        }
        for (int i = 0; i < n; i++) {
            sv[i].output();
        }
        System.out.println("-------MENU------");
        System.out.println(" " +
                "2. Hiển thị thông tin các sinh viên ra màn hình.\n" +
                "3. Tìm kiếm sinh viên theo Id và hiển thị ra màn hình.\n" +
                "4. Sửa các sinh viên có province là “Thanh Hóa” thành “Hải Phòng”\n" +
                "5. Xóa sinh viên theo Id.\n");

            int x;
            System.out.println("Nhap lua chon: ");
            x = sc.nextInt();
        while (x<2 || x>5){
            System.out.println("Moi nhap lai n");
        }

        switch (x) {
            case 2:
                System.out.println("THONG TIN SINH VIEN");
                for (int i = 0; i < n; i++) {
                    sv[i].output();
                }
                break;

            case 3:
                System.out.println("Nhap id sinh vien can tim: ");
                sc.nextLine();
                int idsv = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (sv[i].getId() == idsv) {
                        sv[i].output();
                    }
                }
                break;
            case 4:
                for (int i = 0; i < n; i++) {
                    if (sv[i].diaChi.getProvince().equals("Thanh Hoa")) {
                        sv[i].diaChi.setProvince("Hai Phong");
                        sv[i].output();
                    }

                }
                break;
            case 5:
                System.out.println("Nhap id sinh vien xoa: ");
                sc.nextLine();
                int id = sc.nextInt();
                for (int i = 0; i < n - 1; i++) {
                    if (sv[i].getId() == id) {
                        for (int j = i; j < n - 1; j++) {
                            sv[j] = sv[j + 1];
                        }
                        i--;
                        n--;
                    }
                }
                for (int i = 0; i < n; i++) {
                    sv[i].output();

                }
                break;
        }
    }

}
