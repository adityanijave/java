public class Cube_main {
    public static void main(String[] args) {
        Cube Cube_One = new Cube(10);

        double Area_Of_Cube = Cube_One.Find_AreaOfCube();
        System.out.println("The Area Of The Cube With The Given Side " + Cube_One.Side + "cm is " + Area_Of_Cube+"cm^3");
    }
}
