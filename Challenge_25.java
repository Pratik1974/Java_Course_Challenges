import java.util.Scanner;

public class Challenge_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to showcase of leftshift operator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Your result is: " + result);
    }
}
