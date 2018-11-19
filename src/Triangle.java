import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to make a triangle with the sides of that number");
		int sides = sc.nextInt();
		int i = 0;
		for (i = 1; i <= sides; i++) {
			for (int z = 0; z < i; z++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}
