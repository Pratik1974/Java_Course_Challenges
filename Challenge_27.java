import java.util.Scanner;

public class Challenge_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking odd/even by Bitwise");
        System.out.print("Please, Enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1){
            System.out.println("Your number is odd");
        } else{
            System.out.println("Your number is even");
        }
    }
}
