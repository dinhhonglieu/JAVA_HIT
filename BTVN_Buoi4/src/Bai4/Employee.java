package Bai4;

import java.util.Scanner;

public class Employee {
    private int age,workingDay;
    private String id,name;
//    private double salary;
    public static int PRICE=50;
    static Scanner scanner=new Scanner(System.in);
//    public Employee(int maNV, int tuoi, int ngaycong, String ten){
//    this.id=maNV;
//    this.name=ten;
//    this.age=tuoi;
//    this.workingDay=ngaycong;
//    }
     public Employee(){}
    public String getId() {

        return id;
    }
    public void setId(String maNV) {

        this.id = maNV;
    }
    public String getName(){

        return name;
    }
    public void setName(String ten) {

        this.name =ten;
    }
    public int getAge() {

        return age;
    }
    public void setAge(int tuoi) {

        this.age = tuoi;
    }
    public int getWorkingDay() {

        return workingDay;
    }
    public void setWorkingDay(int ngaycong) {

        this.workingDay = ngaycong;
    }

    public double salary(){

        return this.workingDay * this.PRICE;
    }
    public void nhap(){
        System.out.print("Nhap ma nhan vien :");
        id=scanner.nextLine();
        System.out.print("\n");
        System.out.print("Nhap ten: ");
        name=scanner.nextLine();
        System.out.print("\n");
        System.out.print("NHap tuoi: ");
        age=scanner.nextInt();
        System.out.print("\n");
        System.out.print("Nhap ngay cong :");
        workingDay=scanner.nextInt();
        System.out.print("\n");
    }
    public void xuat(){
        System.out.println("Ma NV :"+getId());
        System.out.println("Ten : "+getName());
        System.out.println("Tuoi: "+getAge());
        System.out.println("So ngay lam viec:"+getWorkingDay());
        System.out.println("Luong :"+salary());

    }
    public static void main(String[] args) {
        Employee nv = new Employee();
        nv.nhap();
        nv.xuat();
    }


}