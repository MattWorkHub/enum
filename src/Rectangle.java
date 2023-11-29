public class Rectangle extends Shape{
    @Override
    public void calculateArea(double base, double heigth,Shapes shapes) {
        System.out.println(Shapes.RECTANGLE + " area = " + base * heigth);
    }
}
