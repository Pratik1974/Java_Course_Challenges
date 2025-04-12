import java.util.Scanner;

public class Challenge_swap_07 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping Station \n\n");
        System.out.println("Enter a value of A: ");
        int a = input.nextInt();
        System.out.println("Enter a value of B: ");
        int b = input.nextInt();


        int t = a;
        a = b;
        b = t;

        System.out.println("Swapping Done");
        System.out.println("Value of A is:" + a);
        System.out.println("Value of B is:" + b);

    }
}
