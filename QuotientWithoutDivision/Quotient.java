package QuotientWithoutDivision;

import java.util.Scanner;
class Quotient { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = 0;
        boolean negative = false;
        if (dividend < 0) {
            dividend = ~dividend + 1;
            negative = !negative;
        }
        if (divisor < 0) {
            divisor = ~divisor + 1;
            negative = !negative;
        }
        while (dividend >= divisor) {
            int temp = divisor;
            int multiple = 1;
            while ((temp << 1) <= dividend) {
                temp = temp << 1;
                multiple = multiple << 1;
            }
            dividend = dividend - temp;
            quotient = quotient + multiple;
        }
        if (negative) {
            quotient = ~quotient + 1;
        }
        System.out.println(quotient);
        sc.close();
    }
}