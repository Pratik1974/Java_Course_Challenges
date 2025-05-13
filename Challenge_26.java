import java.util.Scanner;

public class Challenge_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to showcase of Rightshift operator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Your result is: " + result);
    }
}
