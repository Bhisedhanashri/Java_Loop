package pattern;
import java.util.Scanner;
public class F {

	public static void main(String[] args) {
		System.out.println("Right Angled Triangle Of Numbers");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
