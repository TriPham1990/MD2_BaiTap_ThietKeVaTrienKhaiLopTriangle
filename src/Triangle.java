public class Triangle extends Shape {
    private String color = "blue";

    public Triangle(){
        super();
    }

    public Triangle(String color, double side1, double side2, double side3){
        super(side1,side2,side3);
        this.color = color;
    }
    @Override
    public String toString(){
        return "Triangle \n color of "
                + this.color
                + "\n side1 = "
                + super.getSide1()
                + "\n side2 = "
                + super.getSide2()
                + "\n side3 = "
                + super.getSide3()
                + "\n Area = "
                + this.getArea()
                + "\n Perimeter = "
                + this.getPerimeter();
    }
}
