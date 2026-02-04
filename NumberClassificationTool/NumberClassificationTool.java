package NumberClassificationTool;

import java.util.Scanner;
class NumberClassificationTool{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = 0;
        if(sc.hasNextInt()){
            num = sc.nextInt();
        }
        else{
            System.out.println("Not a valid number!");
        }
        if(num > 0){
            System.out.println("Given number" + " " + num + " " + "is positive");
        }
        else{
            System.out.println("Given number" + " " + num + " " + "is negative");
        }
        if(num % 2 == 0){
            System.out.println("Given number" + " " + num + " " + "is even");
        }
        else{
            System.out.println("Given number" + " " + num + " " + "is odd");
        }
        if(num % 5 == 0 && num % 7 == 0){
            System.out.println("Given number" + " " + num + " " + "is divisible by 5 and 7");
        }
        else{
            System.out.println("Given number" + " " + num + " " + "is not divisible by 5 and 7");
        }
        sc.close();
    }
}
