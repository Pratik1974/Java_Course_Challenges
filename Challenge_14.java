import java.util.Scanner;

public class Challenge_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature converter");
        System.out.println("Enter your temp in F: ");
        float fah = input.nextFloat();
        float cel = (fah - 32) * 5/9;

        System.out.print("This is today Temperature: " + cel + "C");
    }
}

