import java.util.Scanner;

public class Calculating_Salary_Function {

    public static double Per_Week(double Rate_Per_Hour ){
        return 8 * 5 * Rate_Per_Hour;
    }

    public static double Per_Month(double Rate_Per_Hour){
        return 8 * 5 * Rate_Per_Hour * 4;
    }

    public static double Per_Year(double Rate_Per_Hour){
        return 8 * 5 * 4 * 12 * Rate_Per_Hour;
    }

    public static void main(String[] args) {

        System.out.println("Enter Rate Per Hour :");
        Scanner Enter_Rate_Per_Hour = new Scanner(System.in);
        double Rate_Per_Hour = Enter_Rate_Per_Hour.nextDouble();


        System.out.println("Weekly Salary is "+Per_Week(Rate_Per_Hour)+" rupees");
        System.out.println("Monthly Salary is "+Per_Month(Rate_Per_Hour)+" rupees");
        System.out.println("Yearly Salary is "+Per_Year(Rate_Per_Hour)+" rupees");

    }
}