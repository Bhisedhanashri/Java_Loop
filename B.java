package pattern;
import java.util.Scanner;
public class B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Solid Square");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}
