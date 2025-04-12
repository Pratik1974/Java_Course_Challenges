import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Simple Interest");
        System.out.println("Please Enter Principal Amount in Rs: ");
        int P = input.nextInt();
        System.out.println("Please Enter Rate of interest: ");
        float R = input.nextFloat();
        System.out.println("Please Enter how many years is Time Amount: ");
        float T = input.nextFloat();

        float SI = (P*R*T)/100;

        System.out.println("Result is: " + SI);
    }
}
