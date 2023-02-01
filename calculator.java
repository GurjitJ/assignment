import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        char operator;
        Double x, y, r;

        Scanner sc = new Scanner(System.in);

        System.out.println("Pick which operator you would like to use: +, -, *, or /");
        operator = sc.next().charAt(0);

        System.out.println("Enter first number");
        x = sc.nextDouble();

        System.out.println("Enter second number");
        y = sc.nextDouble();

        switch (operator) {

            case '+':
                r = x + y;
                System.out.println(x + " + " + y + " = " + r);
                break;


            case '-':
                r = x - y;
                System.out.println(x + " - " + y + " = " + r);
                break;


            case '*':
                r = x * y;
                System.out.println(x + " * " + y + " = " + r);
                break;


            case '/':
                r = x / y;
                System.out.println(x + " / " + y + " = " + r);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }


    }
}