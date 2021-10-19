public class Square_main {
    public static void main(String[] args) {
        Square Square_one = new Square(10);

        double AreaOfSquare = Square_one.FindAreaOfSquare();
        System.out.println("The Area Of The Given Square Of Side "+ Square_one.Side + "cm is " + AreaOfSquare + "cm^2");
    }
}
