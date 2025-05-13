import java.util.Scanner;

public class Challenge_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcom to showcase of NOT/COMPLIMENT operator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is: " + result);
    }
}
