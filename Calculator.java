import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the type of operation you want(i.e +,-,*,/) : ");
		char c = sc.next().charAt(0);

		switch(c) {
			case '+' : System.out.println("Sum is : " + (a + b));
				   break;
			case '-' : System.out.println("Substraction is : " + (a - b));
				   break;
			case '*' : System.out.println("Multiplication is : " + (a * b));
				   break;
			case '/' : System.out.println("Divivsion is : " + (a / b));
				   break;
			default : System.out.println("Invalid operation");
		}
	}
}