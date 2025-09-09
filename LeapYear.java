import java.util.Scanner;

// Logic:
// if its divisible by 4, its a leap year 
// HOWEVER, if it also happens to be divisible by 100, it MUST ALSO be divisible by 400
// or else it isnt a leap year

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year to test for a leap year");
        boolean isLeap = false;
        int input = scanner.nextInt();

        if (input % 4 == 0) {
            if (input % 100 == 0) {
                if (input % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        }

        System.out.println(isLeap);
    }

}