import java.sql.SQLOutput;
import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input which month you want to count");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 2:
                System.out.println("this month has 28 or 29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month has 30 days");
                break;
            default:
                System.out.println("invalid month");
        }
    }
}
