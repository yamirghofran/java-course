import java.util.Scanner;
public class VolumeCylinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder: ");
		double radiusValue = scanner.nextDouble();
		System.out.print("Enter the height of the cylinder: ");
		double heightValue = scanner.nextDouble();
		double volume = (Math.PI * radiusValue * radiusValue) * heightValue;
		System.out.println("The volume of the cylinder is " + volume);
		scanner.close();
	}
}
