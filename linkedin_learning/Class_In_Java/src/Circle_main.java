public class Circle_main {
    public static void main(String[] args) {
        Circle Circle_One = new Circle(10);

        double AreaOfCircle = Circle_One.Find_Area_Of_Circle();
        System.out.println("The Area Of Circle Of Given Radius "+ Circle_One.Radius + "cm is "+ AreaOfCircle + "cm^2");
    }


}