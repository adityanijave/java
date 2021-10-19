import java.util.Scanner;

public class Taking_Input_From_User3 {
    public static void main(String[] args) {
        Scanner input_for_name = new Scanner(System.in);
        String name = input_for_name.nextLine();
        Scanner input_for_surname = new Scanner(System.in);
        String surname = input_for_surname.nextLine();
        Scanner input_for_age = new Scanner(System.in);
        int age = input_for_age.nextInt();
        System.out.println(name+" "+surname+" is "+age+" year's old!");
    }
}