import java.util.Scanner;

public class Expo_Function {
    public static void main(String[] args) {
        System.out.println("Enter the base : ");
        Scanner user_power = new Scanner(System.in);
        double power = user_power.nextDouble();

        System.out.println("Enter the index : ");
        Scanner user_index = new Scanner(System.in);
        double index = user_index.nextDouble();

        double Result = Math.pow(power,index);
        System.out.println("The Result is "+Result);

    }

}
