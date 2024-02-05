import java.util.Scanner;
public class labsoru5 {

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first integer: ");
	        int firstNumber = scanner.nextInt();
	        System.out.print("Enter the second integer: ");
	        int secondNumber = scanner.nextInt();

	        
	        if ((firstNumber * 3) % (secondNumber * 2) == 0) {
	            System.out.println("The result is true. (Triple of the first number is a multiple of the double of the second number)");
	        } else {
	            System.out.println("The result is false. (Triple of the first number is not a multiple of the double of the second number)");
	        }

	        
	        scanner.close();
	    }
	}

	


