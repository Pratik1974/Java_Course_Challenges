import java.util.Scanner;

public class Challenge_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Finding Area of a triangle");
        System.out.println("Please Enter the Base: ");
        double b = input.nextDouble();
        System.out.println("Please Enter the height: ");
        double h = input.nextDouble();

        double formula = 0.5 * b*h;

        System.out.println("Result is: " + formula);


    }

}
