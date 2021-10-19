public class Triangle {
    double base;
    double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double Find_Area_Of_Triangle(){
        return (base * height) / 2;
    }
}