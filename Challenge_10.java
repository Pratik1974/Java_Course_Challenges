import java.util.Scanner;

public class Challenge_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the Perimeter of rectangle");
        System.out.println("Enter all 4 side in cms: ");
//      Formula is A+B+C+D
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a+b+c+d;

        System.out.println("Perimeter of your rectangle is:" + perimeter);

    }
}
