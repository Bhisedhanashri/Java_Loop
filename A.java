package pattern;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Star Rectangle");
		System.out.print("Enter m: ");
		int m = input.nextInt();
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=m;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
