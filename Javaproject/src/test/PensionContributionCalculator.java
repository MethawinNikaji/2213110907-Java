package test;
import java.util.Scanner;
import java.text.*;
public class PensionContributionCalculator {
   public static void main(String[] args) {
       final int SALARY_CEILING = 6000;
       final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
       final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
       final double EMPLOYEE_RATE_55_TO_60 = 0.13;
       final double EMPLOYER_RATE_55_TO_60 = 0.13;
       final double EMPLOYEE_RATE_60_TO_65 = 0.075;
       final double EMPLOYER_RATE_60_TO_65 = 0.09;
       final double EMPLOYEE_RATE_65_ABOVE = 0.05;
       final double EMPLOYER_RATE_65_ABOVE = 0.075;
       DecimalFormat frm = new DecimalFormat("#,###.00");
       Scanner answerme = new Scanner(System.in);
       System.out.print("Enter the monthly salary : $");
       int salary = answerme.nextInt();
       System.out.print("Enter the age : ");
       int age = answerme.nextInt();
       double ONE,TWO;
       if (age <= 55) { // 55 and below
           ONE = salary * EMPLOYER_RATE_55_AND_BELOW;
           TWO = salary * EMPLOYER_RATE_55_AND_BELOW;

       } else if (age <= 60) { // (60, 65]
           ONE = salary * EMPLOYER_RATE_55_TO_60;
           TWO = salary * EMPLOYER_RATE_55_TO_60;

       } else if (age <= 65) { // (55, 60]
           ONE = salary * EMPLOYER_RATE_60_TO_65;
           TWO = salary * EMPLOYER_RATE_60_TO_65;

       } else { // above 65
           ONE = salary * EMPLOYEE_RATE_65_ABOVE;
            TWO = salary * EMPLOYEE_RATE_65_ABOVE;

       }
       System.out.println("The employee's contribution is : $" + frm.format(ONE));
       System.out.println("The employer's contribution is : $" + frm.format(TWO));
       double total = ONE + TWO;
       System.out.println("The total contribution is:$" + frm.format(total));


   }
}

