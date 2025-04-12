import java.util.Scanner;

public class Chanllenge_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Positive and Negative\n");
        System.out.print("Please, Enter a number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.print(num + " This is Positive number");
        }
        else if(num == 0){
            System.out.println("This is equal to zero");
        } else{
            System.out.println("Your number is Negative");
        }
    }
}
