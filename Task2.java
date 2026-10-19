package assessment1;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("============================================");
		System.out.println("           Welcome to our program ") ;
		System.out.println("'Quadratic Equation Solver ax² + bx + c = 0'");
		System.out.println("============================================");
		Scanner input = new Scanner(System.in);
		System.out.print("\n\n Input a: ");
		double a = input.nextDouble();
		System.out.print(" Input b: ");
		double b = input.nextDouble();
		System.out.print(" Input c: ");
		double c = input.nextDouble();
		System.out.print("\n\n");
		System.out.print("----------------------------------------------\n");
		int A = (int) a;
		int B = (int) b;
		int C = (int) c;
		System.out.println("Roots of this equation: "+ A + "x² + " + B + "x + " + C + " = 0 are:");
		
		if (a == 0) {
			//System.out.println("Please input the right number, a cannot equal to 0 in quadratic equation");
			double x = -c / b;
			System.out.println("x = " + x);
		} else {
			double delta = b * b - 4 * a * c ;
			if (delta >= 0) {
				double x1 = (-b + Math.sqrt(delta))/ (2*a) ;
				double x2 = (-b - Math.sqrt(delta))/ (2*a) ;
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else {
				double real_num = -b / (2*a);
				double imag_num = Math.sqrt(-delta)/ (2*a);
				System.out.println("x1 = " + real_num +" + " + imag_num +"i");
				System.out.print("x1 = " + real_num +" - " + imag_num +"i");
                
			}
		}
        System.out.print("----------------------------------------------\n");
        input.close();
	}

}