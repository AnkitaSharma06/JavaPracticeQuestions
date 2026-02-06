package Comparison;

import java.util.Scanner;
class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int diff = num1 - num2;
        int sign = (diff >> 31) & 1;
        int max = num1 * (sign ^ 1) + num2 * sign;
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);
        sc.close();
    }
}