package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap n tu ban phim");
        int n = scanner.nextInt();
        int a[] = new int[n];
        nhap(a, n);
        xuat(a, n);
        tinh(a, n);
        viTri(a,n);
        kiemTra(a,n);
        kiemTraSoNguyenTo(a,n);
        sapXep(a,n);
    }

    public static void nhap(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d] = ", i);
            a[i] = scanner.nextInt();
        }
    }

    public static void xuat(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
//tim tbc cac so le o vi tri so chan
    public static void tinh(int a[], int n) {
        int count = 0;
        int tong = 0;
        float tbc;
        for (int i = 1;i <= n; i++) {
            if (i % 2 == 0) {
                if (a[i-1] % 2 != 0) {
                    count++;
                    tong += a[i-1];
                }
            }
        }
        if (count == 0) {
            System.out.println("khong co so nao trong mang thoa man");
        } else {
            tbc = tong / count;
            System.out.println("tbc la:" + tbc);
        }
  }
//  tim vi tri so nho nhat
    public static void viTri(int a[], int n)
    {
        int index=1;
        int min=a[0];
        for (int i = 0; i < n; i++) {
            if(a[i] <min)
            {
                min=a[i];
                index=i+1;
            }
        }
        System.out.println("Vi tri chua gia tri min la:" + index);
    }
//    Kiem tra mang co so chinh phuong khong? neu co in ra man hinh
    public static boolean soChinhPhuong(int n){
        if(n<1) return false;
        double i=Math.sqrt(n);
        if(i*i == n) return true;
        return false;
    }
    public static void kiemTra(int a[], int n)
    { System.out.print("cac so chinh phuong trong mang la:");
        for (int i = 0; i < n; i++) {
            if(soChinhPhuong(a[i]))
                System.out.print(a[i] +" ");
        }
        System.out.println("\n");
    }

//    Kiem tra so nguyen to
    public static boolean soNguyenTo(int n){
        if(n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0) return false;
            }
           return true;
        }
    public static void kiemTraSoNguyenTo(int a[], int n){
        System.out.print("cac so nguyen to trong mang la:");
        for (int i = 0; i < n; i++) {
            if(soNguyenTo(a[i]))
                System.out.print(a[i] +" " );
        }
        System.out.println("\n");
    }
//    sap xep theo thu tu tang dan
    public static void sapXep(int a[], int n){
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if(a[i] >a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("mang xep theo thu tu tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] +" ");
        }
    }
}
