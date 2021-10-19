import java.util.Scanner;

public class If_Else_statement_5 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String new_name = name.nextLine();
        Scanner weight = new Scanner(System.in);
        double new_name_weight = weight.nextDouble();

        if (new_name_weight > 100)
        {System.out.println("Your In Danger! "+new_name);}
        else
        {System.out.println(new_name);
            System.out.println("Your Safe!");}

    }
}
