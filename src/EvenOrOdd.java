import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        evenOrOdd(Integer.parseInt(num));
    }
    public static void evenOrOdd(int x){
        if(x%2==0){
            System.out.println(x +" : is Even Number");
        }else {
            System.out.println(x +" : is Odd Number");
        }

    }

}
