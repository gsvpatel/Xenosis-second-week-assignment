 class Circle extends Shape {
    private double radius;

     public Circle(double radius) {
         this.radius = radius;
     }

     @Override
     double calculateArea() {
         Math math = null;
        double area =  math.PI*radius*radius;
         System.out.println(area);
         return area ;
     }
 }
