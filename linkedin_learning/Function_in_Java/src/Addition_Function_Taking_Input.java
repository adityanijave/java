import java.util.Scanner;

public class Addition_Function_Taking_Input {

    public static void Addition(int a, int b){
        int add = a + b;
        System.out.println("The Addition Is "
                +add);
    }

    public static void main(String[] args) {
        System.out.println("Enter number 1 : ");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Enter Number 2 : ");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();

        Addition(a,b);

    }
}
