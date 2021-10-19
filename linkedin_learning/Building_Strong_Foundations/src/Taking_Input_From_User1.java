import java.util.Scanner;

public class Taking_Input_From_User1 {
    public static void main(String[] args) {
        String User_Name = "Aditya";
        String User_Surname = "Nijave";
        double User_CGPA = 7.6;
        System.out.println(User_Name+" "+User_Surname+" "+"having CGPA "+ User_CGPA);
        System.out.println("What do you want to update CGPA ? ");

        Scanner input = new Scanner(System.in);
        User_CGPA = input.nextDouble();
        System.out.println(User_Name+" "+User_Surname+" "+"having updated CGPA is "+ User_CGPA);

    }
}