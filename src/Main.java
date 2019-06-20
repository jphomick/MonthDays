import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of days in a month:");
        int days = read.nextInt();
        String months = "";

        switch(days) {
            case 28: months = "February";
                break;
            case 30: months = "April June September November";
                break;
            case 31: months = "January March May July August October December";
                break;
            default: months = "No matches";
        }

        System.out.println(months);
    }
}
