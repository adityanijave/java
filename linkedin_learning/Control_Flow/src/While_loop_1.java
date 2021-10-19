import java.util.Scanner;

public class While_loop_1 {
    public static void main(String[] args) {
        System.out.println("enter a number less than 10 : ");
        Scanner user_number = new Scanner(System.in);
        int number1 = user_number.nextInt();

        while (number1 < 10)
        {System.out.println("Still less than 10 this given number " + number1);
        number1 ++ ;}

        System.out.println("now ok !, number is equal to 10 = "+number1);
    }
}