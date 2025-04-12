import java.util.Scanner;

public class Challengs_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking the of greatest of three number");
        System.out.print("Please,Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Please,Enter Second number: ");
        int num2 = input.nextInt();
        System.out.print("Please,Enter third number: ");
        int num3 = input.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("First number is greatest of all three number");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println("Second number is greatest of all three number");
        } else if(num3 >= num2){
            System.out.println("Third number is greatest of all three number");
        }
    }
}
