import java.util.Scanner;

public class If_Else_statement_3 {
    public static void main(String[] args) {
        System.out.println("Choose a number between 1 to 10");
        Scanner Entered_Number = new Scanner(System.in);
        int User_Number = Entered_Number.nextInt();

        if ( User_Number > 5)
        {System.out.println("You Entered A Number Which Is Greater Than 5!");}
        else
        {System.out.println("You Entered A Number Which Is less Than 5!");}

    }
}