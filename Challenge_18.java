import java.util.Scanner;

public class Challenge_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator\n");
        System.out.print("Please, Enter the year that you want to check: ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
            System.out.println("Your year is a leap year");
        }
        else {
            System.out.println("Your year is not a leap year");
        }
//        if (year % 400 == 0){
//            System.out.println("Your year is a leap year");
//        } else if (year % 100 == 0){
//            System.out.println("Your year is not a leap year");
//        }else if(year % 4 == 0){
//            System.out.println("Your year is a leap year");
//        } else {
//            System.out.println("Your year is not a leap year");
//        }
    }
}
