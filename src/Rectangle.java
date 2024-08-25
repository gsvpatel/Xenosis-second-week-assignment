public class Rectangle extends Shape{
    private double length;
    private double bridth;

    public Rectangle(double length, double bridth) {
        this.length = length;
        this.bridth = bridth;
    }

    public Rectangle() {

    }

    @Override
    double calculateArea() {
      double area= length*bridth;
        System.out.println(area);
        return area ;
    }

    public static void main(String[] args) {
        Shape[] s1 = new Shape[3];
        s1[0] = new Rectangle(10,20);
        s1[1]= new Circle(2);
        s1[2]= new Triangle(233,50);
        for(Shape s2 :s1){
            s2.calculateArea();
        }

        }
        }


