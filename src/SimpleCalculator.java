<<<<<<< HEAD
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        char Operator;
        Double number1, number2, result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Your Operator : + , - , * , /");
        Operator = sc.next().charAt(0);

        System.out.println("Enter Your First number");
        number1 = sc.nextDouble();

        System.out.println("Enter Your Second number");
        number2 = sc.nextDouble();

        switch (Operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + "=" + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + "=" + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + "=" + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + "=" + result);
                break;
            default:
                System.out.println("Invalide input");
                break;

        }
        sc.close();
    }


}



=======
public class SimpleCalculator {
}
>>>>>>> origin/master
