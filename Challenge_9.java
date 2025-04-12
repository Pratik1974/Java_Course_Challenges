import java.util.Scanner;

public class Challenge_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My Calculator\n");
        System.out.println("Please Enter first number: ");
        double a = input.nextDouble();
        System.out.println("Please Enter second number: ");
        double b = input.nextDouble();

        double mul = a * b;
        System.out.println("Result is: " + mul);

    }
}
