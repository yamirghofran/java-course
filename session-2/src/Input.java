import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
//create scanner object
		Scanner input = new Scanner(System.in);
// to read the input line by line
		System.out.print("Enter your full name: ");
		String FullName = input.nextLine();
		System.out.println("Hello " + FullName);
// to read integer
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Your age is " + age);
// to read float
		System.out.print("Enter your height: ");
		float height = input.nextFloat();
		System.out.println("Your height is " + height);
// you have to close the object after using it
		input.close();
	}
}
