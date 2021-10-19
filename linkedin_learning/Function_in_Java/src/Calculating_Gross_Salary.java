import java.util.Scanner;

public class Calculating_Gross_Salary {

    public static double Calculating_Over_Time(double Rate_Per_Hour, double Over_Time_Hour){
        int Regular_Working_Hour_In_A_Month= 8 ;
        return (Regular_Working_Hour_In_A_Month + Over_Time_Hour) * 5 * 4 * Rate_Per_Hour;


    }

    public static void main(String[] args) {

        System.out.println("Enter Employee First Name :");
        Scanner Enter_First_Name = new Scanner(System.in);
        String First_Name = Enter_First_Name.nextLine();

        System.out.println("Enter Employee Last Name :");
        Scanner Enter_Last_Name = new Scanner(System.in);
        String Last_Name = Enter_Last_Name.nextLine();

        System.out.println("Is Employee Did Over Time Work?");
        System.out.println("Enter Your Replay In 'yes' or 'no' Term ");
        Scanner Did_Over_Time = new Scanner(System.in);
        String Over_Time_Replay = Did_Over_Time.nextLine();

        if (Over_Time_Replay.equals("yes")){

            System.out.println("Enter Rate Per Hour :");
            Scanner Enter_Rate_Per_Hour = new Scanner(System.in);
            double Rate_Per_Hour = Enter_Rate_Per_Hour.nextDouble();

            System.out.println("Enter How Many Hours Employee Did Over Time :");
            Scanner Enter_Over_Time_Hour = new Scanner(System.in);
            double Over_Time_Hour = Enter_Over_Time_Hour.nextDouble();

            System.out.println(First_Name + " " + Last_Name + " Your Salary With Over Time Payment Is " +
                    Calculating_Over_Time(Rate_Per_Hour, Over_Time_Hour) + " rupees");
        }

        if (Over_Time_Replay.equals("no")){

            System.out.println("Enter Rate Per Hour :");
            Scanner Enter_Rate_Per_Hour = new Scanner(System.in);
            double Rate_Per_Hour = Enter_Rate_Per_Hour.nextDouble();

            int Over_Time_Hour = 0;

            System.out.println(First_Name + " " + Last_Name + " Your Salary Is " +
                    Calculating_Over_Time(Rate_Per_Hour, Over_Time_Hour) + " rupees");
        }
    }
}
