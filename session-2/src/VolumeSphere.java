import java.util.Scanner;
public class VolumeSphere {
	public static void main(String[] args) {
		Scanner radius = new Scanner(System.in);
		System.out.print("Enter the radius of the sphere: ");
		double radiusValue = radius.nextDouble();
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radiusValue, 3);
		System.out.println("The volume of the sphere is " + volume);
		radius.close();
	}
}
