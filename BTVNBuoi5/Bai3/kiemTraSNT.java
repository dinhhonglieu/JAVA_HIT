package Bai3;

public class kiemTraSNT {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
//                else return true;
            }
        }
      return true;
    }

    public static boolean isPrime(long n) {
        if (n == (int) n) {
            if (n < 2) return false;
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return false;
                }
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isPrime(float n) {
        if (n == (int) n) {
            if (n < 2) return false;
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return false;
                }
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isPrime(double n) {
        if (n == (int) n) {
            if (n < 2) return false;
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return false;
                }
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Kieu int");
        System.out.println(isPrime(2));
        System.out.println(isPrime(9));
        System.out.println("Kieu long ");
        System.out.println(isPrime(25l));
        System.out.println(isPrime(3l));
        System.out.println("Kieu float");
        System.out.println(isPrime(8.9f));
        System.out.println(isPrime(6f));
        System.out.println("Kieu double");
        System.out.println(isPrime(3.3));
        System.out.println(isPrime(9.8));

    }

}
