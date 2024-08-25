public class bike extends Vehicles {
    @Override
    void start() {
        System.out.println("Bike is started");

    }

    public static void main(String[] args) {
        Vehicles[] v1 = new Vehicles[3];
        v1[0]=new Vehicles();
        v1[1]= new Car();
        v1[2]=new bike();
        for(Vehicles v2:v1){
            v2.start();

        }
    }
}
