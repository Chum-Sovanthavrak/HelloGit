package assessment1;
import java.util.Scanner;

public class Task1{

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
	
		int n;
		int sum = 0;
		double Average = 0;
		n = input.nextInt();
		for (int k=1000; k>=n; k--) {
			System.out.print(k + " ");
			 sum = sum + k;
			 Average = sum/(1000-n + 1);
		}
		System.out.println("\nSum is: " + sum);
		System.out.println("Average is: " + Average);
		input.close();
	}

}
