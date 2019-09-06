public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle("yellow",2,3,3);
        System.out.println(triangle);
    }
}
