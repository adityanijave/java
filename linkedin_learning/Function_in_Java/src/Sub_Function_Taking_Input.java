import java.util.Scanner;

public class Sub_Function_Taking_Input {
    public static void Subtraction(int a , int b){
        int sub = a - b;
        System.out.println("The Subtraction Of Given Numbers Is "+sub);
    }

    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int a  = n1.nextInt();
        System.out.println("Enter Number 2 : ");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();

        Subtraction(a,b);
    }
}
