import java.util.Scanner;

public class Challenge_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate grades based on marks");
        System.out.print("Please enter your marks out of 100: ");
        float marks = input.nextFloat();

        if (marks >= 90){
            System.out.println("Excellent");
        } else if (marks >= 75 && marks <= 89){
            System.out.println("Good");
        } else if (marks >= 60 && marks <= 75){
            System.out.println("Average");
        } else if (marks >= 30 && marks <= 60){
            System.out.println("Pass");
        } else if (marks < 30){
            System.out.println("fail");
        } else if (marks < 100){
            System.out.println("Wrong number");
        }
    }
}
