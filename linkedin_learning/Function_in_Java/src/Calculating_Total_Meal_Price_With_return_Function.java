public class Calculating_Total_Meal_Price_With_return_Function {
    public static double Calculation(double TipRate, double TaxRate, double ListedMealPrice) {
        double tip = TipRate * ListedMealPrice;
        double tax = TaxRate * ListedMealPrice;
        double result = ListedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Your Bill Is "+ Calculation(10,10,10));
    }
}
