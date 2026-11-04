import java.util.Random;

public class random {
	public static void main(String[] args) {
		Random rng = new Random();

		// Generate and print a random integer from 1 through 100.
		int number = rng.nextInt(100) + 1;
		System.out.println("Random number: " + number);
	}
}
