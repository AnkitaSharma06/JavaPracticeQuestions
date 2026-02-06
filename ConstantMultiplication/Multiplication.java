package ConstantMultiplication;

import java.util.Scanner;
class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = (num << 3) - num;
        System.out.println(result);
        sc.close();
    }
}