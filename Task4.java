package assessment1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        input.useDelimiter("[-|\\s]+");       
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Input: ");
            int year = input.nextInt();
            int month = input.nextInt();
            int day = input.nextInt();
            isValid = true;          
            if (year < 999 || year > 2100) {
                isValid = false;
            } else if (month < 1 || month > 12) {
                isValid = false;
            } else if (day < 1) {
                isValid = false;
            } else if (month == 2) {
                boolean isLeapYear = (year % 4 == 0);
                int maxDays = isLeapYear ? 29 : 28;
                if (day > maxDays) {
                    isValid = false;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30) {
                    isValid = false;
                }
            } else {
                if (day > 31) {
                    isValid = false;
                }
            }
            if (isValid) {
            System.out.println("Output: valid");
            isValid = true;
            } else {
            System.out.println("Output: invalid, Please input again");
            }
        }      
        input.close();
    }
}   