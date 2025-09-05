import java.util.Scanner;
public class VolumeCylinder {
	public static void main(String[] args) {
		Scanner radius = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder: ");
		double radiusValue = radius.nextDouble();
		System.out.print("Enter the height of the cylinder: ");
		double heightValue = radius.nextDouble();
		double volume = (Math.PI * radiusValue * radiusValue) * heightValue;
		System.out.println("The volume of the cylinder is " + volume);
		radius.close();
	}
}
