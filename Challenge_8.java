import java.util.Scanner;

public class Challenge_8 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My calculator\n");
        System.out.println("Please Enter the First Number: ");
        int a = input.nextInt();
        System.out.println("Please Enter the First Number: ");
        int b = input.nextInt();

        System.out.println("Addition is: "+ (a+b));
        System.out.println("Subtraction is: "+ (a-b));
        System.out.println("Multiplication is: " + (a*b));
        System.out.println("Division is: " + (a/b));
        System.out.println("Modular is:" + (a%b));


    }
}
