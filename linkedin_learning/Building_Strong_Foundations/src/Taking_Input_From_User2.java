import java.util.Scanner;

public class Taking_Input_From_User2 {
    public static void main(String[] args) {
        String User_Name = "Aditya";
        String User_Surname = "Nijave";
        double User_Percentage = 0;

        Scanner input = new Scanner(System.in);
        User_Percentage = input.nextDouble();

        System.out.println(User_Name+" "+User_Surname+" Having Percentage "+User_Percentage);
    }
}