package PowerOfTwo;

import java.util.Scanner;
class Identify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}