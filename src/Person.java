public class Person {
    private final String name;
    private final double age;


    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }


    public void display() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);

    }

    public static void main(String[] args) {
        Person p1 = new Person("kushi", 22);
        p1.display();
    }
}
