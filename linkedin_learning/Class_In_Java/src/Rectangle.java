public class Rectangle {
    double Side_One ;
    double Side_Two;

    public Rectangle(double Side_One , double Side_Two){
        this.Side_One = Side_One;
        this.Side_Two = Side_Two;
    }

    public double Find_Area_Of_Rectangle (){
        return  Side_One * Side_Two;

    }
}
