import java.util.Scanner;

public class Challenge_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Age Calculate ");
        System.out.print("Please, Enter your age: ");
        int age = input.nextInt();

        if (age >= 65 ){
            System.out.println("You are a senior citizen");
        } else if (age >= 20){
            System.out.println("You are an adult");
        } else if (age >= 13){
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a child jao bonvita pio");
        }
    }
}
