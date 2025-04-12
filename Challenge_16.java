import java.util.Scanner;

public class Challenge_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We check the Number is even and odd");
        System.out.print("Please, Enter a Number: ");
        int num = input.nextInt();

        if(num%2==0){
            System.out.print("This is even number");
        }
        else{
            System.out.println("This is odd number");
        }
    }
}
