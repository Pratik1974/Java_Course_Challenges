import java.util.Scanner;

public class Challenge_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR operator\n");
        System.out.print("Please Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, Enter the other number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Result is: " + result);
    }
}

