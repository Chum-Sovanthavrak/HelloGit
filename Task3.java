package assessment1;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Please input 5 numbers: ");
        int firstNum = input.nextInt();
        int min = firstNum; 
        int max = firstNum;
        for(int i = 1; i<5; i++){
            int n = input.nextInt();
            if(n > firstNum) max = n;
            if(n < firstNum) min = n;

        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min); 
	    input.close();
	}

}