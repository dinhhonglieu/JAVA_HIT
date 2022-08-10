package Bai2;

import java.util.Scanner;

public class Address {
    private String id;
    private String district;
    private String province;
    Scanner scanner =new Scanner(System.in);
    public Address() {
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap huyen: ");
        district = sc.nextLine();
        System.out.print("Nhap tinh: ");
        province = sc.nextLine();
    }
    public String getId() {
        return id;
    }
    public String getProvince(){
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void output() {
        System.out.println("ID: " + id);
        System.out.println("District: " + district);
        System.out.println("Province: " + province);
    }
}
