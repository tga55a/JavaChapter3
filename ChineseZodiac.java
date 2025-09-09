import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        int yearSign = year % 12;
        String Sign = "";

        switch (yearSign) {
            case 0:
                Sign = "monkey";
                break;
            case 1:
                Sign = "rooster";
                break;
            case 2:
                Sign = "dog";
                break;
            case 3:
                Sign = "pig";
                break;
            case 4:
                Sign = "rat";
                break;
            case 5:
                Sign = "ox";
                break;
            case 6:
                Sign = "tiger";
                break;
            case 7:
                Sign = "rabbit";
                break;
            case 8:
                Sign = "dragon";
                break;
            case 9:
                Sign = "snake";
                break;
            case 10:
                Sign = "horse";
                break;
            case 11:
                Sign = "sheep";
                break;
        }
        System.out.println("The Chinese Zodiac animal for 2024 is: " + Sign);

    }
}
