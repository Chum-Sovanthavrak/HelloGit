package assessment1;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input n: ");
        int n = input.nextInt();
        System.out.print("\nAll prime numbers from 2 to " + n + ": ");
        
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
           
        }
        System.out.print("\n");
        input.close();

    }
}
