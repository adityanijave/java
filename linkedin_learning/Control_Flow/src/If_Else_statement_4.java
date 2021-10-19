import java.util.Scanner;
public class If_Else_statement_4 {
    public static void main(String[] args) {
        System.out.println("Are you Owner Of This Laptop? Enter Your Response In 'yes' Or 'no'");
        Scanner InputOne = new Scanner(System.in);
        String ResponseOne = InputOne.nextLine();

        if (ResponseOne.equals("yes"))




        {System.out.println("Enter Your Name :");
        Scanner InputTwo = new Scanner(System.in);
        String ResponseTwo = InputTwo.nextLine();

        if (ResponseTwo.equals("aditya"))
        {System.out.println("Login Successful !");}
        else
        {System.out.println("Login Failed !");
        System.out.println("You Are Not Owner Of This Laptop !");}


        }
        else
        {System.out.println("Sorry, You Cannot Login!");}
    }
}
