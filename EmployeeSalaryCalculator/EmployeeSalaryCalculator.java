package EmployeeSalaryCalculator;
import java.util.Scanner;
class EmployeeSalaryCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee's basic salary:");
        float basicSalary = sc.nextFloat();
        float Salary=0;
        if(basicSalary >= 30000){
            float hra = basicSalary*0.20f;
            float da = basicSalary*0.15f;
            Salary = basicSalary + hra + da;
        }
        else{
            float hra = basicSalary*0.10f;
            float da = basicSalary*0.8f;
            Salary = basicSalary + hra + da;
        }
        float netSalary = Salary - (basicSalary*0.12f);
        System.out.println("Net Salary of the employee is:" + netSalary);
        sc.close();
    }
}

