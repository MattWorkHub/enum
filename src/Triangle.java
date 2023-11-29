public class Triangle extends Shape {

    @Override
    public void calculateArea(double base, double heigth,Shapes shapes) {
        System.out.println( Shapes.TRIANGLE + " area = " + base * heigth / 2);
    }
}
