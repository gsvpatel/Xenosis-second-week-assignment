public class MethodOverloding {

    String name, city;
    int age;

    public MethodOverloding() {
        this.age=age;
        this.name=name;
        this.city=city;
    }

    public static void main(String[] args) {
    MethodOverloding m1 = new MethodOverloding();
    m1.test("kashi",22,"Bangaluru");
    }

    public void test(String name, int age, String city) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }

}



