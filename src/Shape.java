public class Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Shape() {

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return Math.sqrt(
                (side1 + side2 + side3)
                        * (side1 + side2 - side3)
                        * (side1 + side3 - side2)
                        * (side2 + side3 - side2)
                        / 4);
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        return "Triangle \n side1 = "
                + this.side1
                + "\n side2 = "
                + this.side2
                + "\n side3 = "
                + this.side3
                + "\n Area = "
                + this.getArea()
                + "\n Perimeter = "
                + this.getPerimeter();
    }
}
