public class Triangle_main {
    public static void main(String[] args) {
        Triangle Triangle_one = new Triangle(10, 10);

        double AreaOfTriangleOne = Triangle_one.Find_Area_Of_Triangle();
        System.out.println("the area of triangle with given base " + Triangle_one.base + "cm & " + "height " +
                Triangle_one.height + "cm is " + AreaOfTriangleOne);
    }
}