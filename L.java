package pattern;
import java.util.Scanner;
public class L {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ODD Number Triangle");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
					System.out.print((2*j-1)+" ");
			}System.out.println();
		}
	}

}
