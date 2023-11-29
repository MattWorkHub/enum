public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        shape.calculateArea(5,10,null);
        rectangle.calculateArea(5,10, Shape.Shapes.RECTANGLE);
        triangle.calculateArea(5,10,Shape.Shapes.TRIANGLE);
    }
}