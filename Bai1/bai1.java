package btvnbuoi1;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ngay;
        do {
            System.out.print("nhap vao ngay sinh:");
            ngay = scanner.nextInt();
        } while (ngay < 1 || ngay > 31);
        int thang;
        do {
            System.out.print("nhap vao thang sinh:");
            thang = scanner.nextInt();
            if (thang == 2 && ngay > 29) {
                System.out.print("Ngay thang khong hop le");
            }
        } while (thang < 1 || thang > 12);
        switch (thang) {
            case 1: {
                if (ngay >= 20 && ngay <= 31) System.out.print("Bao binh");
                else System.out.print("Ma ket");
                break;
            }
            case 2: {
                if (ngay >= 1 && ngay <= 18) System.out.print("Bao binh");
                else System.out.print("Song ngu");
                break;
            }
            case 3: {
                if (ngay >= 1 && ngay <= 20) System.out.print("Song ngu");
                else System.out.print("Bach duong");
                break;
            }
            case 4: {
                if (ngay >= 1 && ngay <= 20) System.out.print("Bach duong");
                else System.out.print("Kim nguu");
                break;
            }
            case 5: {
                if (ngay >= 1 && ngay <= 20) System.out.print("Kim nguu");
                else System.out.print("Song tu");
                break;
            }
            case 6: {
                if (ngay >= 1 && ngay <= 21) System.out.print("Song tu");
                else System.out.print("cu giai");
                break;
            }
            case 7: {
                if (ngay >= 1 && ngay <= 22) System.out.print("Cu giai");
                else System.out.print("Su tu");
                break;
            }
            case 8: {
                if (ngay >= 1 && ngay <= 22) System.out.print("Su tu");
                else System.out.print("Xu tu");
                break;
            }
            case 9: {
                if (ngay >= 1 && ngay <= 22) System.out.print("Xu nu");
                else System.out.print("Thien binh");
                break;
            }
            case 10: {
                if (ngay >= 1 && ngay <= 23) System.out.print("Thien binh");
                else System.out.print("Bo cap");
                break;
            }
            case 11: {
                if (ngay >= 1 && ngay <= 22) System.out.print("Bo cap");
                else System.out.print("Nhan ma");
                break;
            }
            case 12: {
                if (ngay >= 1 && ngay <= 21) System.out.print("Nhan ma");
                else System.out.print("Ma ket");
                break;
            }
        }
    }
}
