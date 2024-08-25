public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
         double area =  0.5*base*height;
        System.out.println(area);
        return area ;
    }
}
