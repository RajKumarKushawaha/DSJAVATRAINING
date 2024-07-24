import java.util.*;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class basicCalculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Enter second number b: ");
                double b = sc.nextDouble();
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("Enter second number b: ");
                double c = sc.nextDouble();
                System.out.println(a-c);
                break;
            case '*':
                System.out.println("Enter second number b: ");
                double d = sc.nextDouble();
                System.out.println(a*d);
                break;
            case '/':
                System.out.println("Enter second number b: ");
                double e = sc.nextDouble();
                if(e !=0){
                    System.out.println(a/e);
                } else {
                    System.out.println("Error! Division by zero");
                }
                break;
            case '%':
                System.out.println("Enter second number b: ");
                double r = sc.nextDouble();
                System.out.println(a%r);
                break;
            case '2':
                System.out.println(pow(a, 2));
                break;
            case 's':
                if( a >=0){
                    System.out.println(sqrt(a));
                } else {
                    System.out.println("Error! Square root of negative number.");
                }
                break;

            default:
                System.out.println("Wrong operator");
        }
    }
}
