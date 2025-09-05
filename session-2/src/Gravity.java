import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = -9.81;

		System.out.print("Enter time (t): ");
		double t = scanner.nextDouble();

		System.out.print("Enter initial velocity (vi): ");
		double vi = scanner.nextDouble();

		System.out.print("Enter initial position (xi): ");
		double xi = scanner.nextDouble();

		double position = 0.5 * a * t * t + vi * t + xi;

		System.out.println("Position x(t) = " + position);

		scanner.close();
	}
}
