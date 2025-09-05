//LightSpeed
public class Lightspeed {
	public static void main(String[] args) {
// Compute distance light travels using long variables.
		float lightSpeed;
		float days;
		float seconds;
		float distance;
//----------------------------------------------------//
//--> try this code with double, int or long and discuss the results
//----------------------------------------------------//
// approximate speed of light in miles per second

// What is the distance that light travels in 4 days?
		days = 4; // specify number of days here
		lightSpeed = 299792458;
		seconds = days * 24 * 60 * 60; // convert to seconds
		distance = lightSpeed * seconds; // compute distance
		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
	}
}
