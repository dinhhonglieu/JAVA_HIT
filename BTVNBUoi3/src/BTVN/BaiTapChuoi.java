package BTVN;

import java.util.Locale;
import java.util.Scanner;

public class BaiTapChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi a");
        String a = scanner.nextLine();
//        viet hoa moi chu cai dau
        char[]  charArray = a.toCharArray();
        boolean foundSpace=true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])){
                if (foundSpace){
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }else {
                foundSpace = true;
            }
        }
        a= String.valueOf(charArray);
        System.out.println("chuoi sau khi in hoa chu cai dau la: "+a);
        System.out.print("chuoi sau khi xoa dau cach: ");
        System.out.println(a.replaceAll("\\s+", " ").trim());
//
    }
    }

