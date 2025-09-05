import java.util.Scanner;
public class AreaTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base of the triangle: ");
		double baseValue = scanner.nextDouble();
		System.out.print("Enter the height of the triangle: ");
		double heightValue = scanner.nextDouble();
		double area = (baseValue * heightValue) / 2;
		System.out.println("The area of the triangle is " + area);
		scanner.close();
	}
}
