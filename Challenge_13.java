import java.util.Scanner;

public class Challenge_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find compound interest");
        System.out.println("Please Enter Principal amount: ");
        int P = input.nextInt();
        System.out.println("Please Enter Annual interest rate: ");
        float R = input.nextFloat();
        System.out.println("Please Enter Time: ");
        float T = input.nextFloat();

        double CI = P* Math.pow((1+ R/100),T);

        System.out.println("Result is: " + CI);
    }
}
