import java.util.Scanner;

public class Multi_Function_Taking_Input {
    public static void Multiplication(int a ,int b){
        int Multiplication_Of_Numbers = a * b;
        System.out.println("The Product Of The Given Numbers Are "+Multiplication_Of_Numbers);
    }

    public static void main(String[] args) {
        System.out.println("Enter the NUmber 1 : ");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Enter The Number 2 : ");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();

        Multiplication(a,b);
    }
}
