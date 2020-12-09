import java.sql.SQLOutput;
import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input which month you want to count");
        int month = scanner.nextInt();
        String dayOfMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfMonth = "31";
                break;
            case 2:
                dayOfMonth= "28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = "30";
                break;
            default:
                dayOfMonth = "";
        }
        if (dayOfMonth!="") {
            System.out.println("this month has "+dayOfMonth+" days");
        }else {
            System.out.println("Invalid month");
        }
        }
    }

