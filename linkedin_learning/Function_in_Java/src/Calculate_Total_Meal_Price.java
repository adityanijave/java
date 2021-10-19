public class Calculate_Total_Meal_Price {
    public static void Calculation(double TipRate, double TaxRate, double ListedMealPrice){
        double tip = TipRate * ListedMealPrice ;
        double tax = TaxRate * ListedMealPrice;
        double result = ListedMealPrice + tip + tax;
        System.out.println("Your Bill Is "+result);
    }

    public static void main(String[] args) {
        Calculation(0.5, 0.18, 100);
    }
}
