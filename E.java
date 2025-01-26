package pattern;
import java.util.Scanner;
public class E {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Right Angled Triangle Of Stars");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {		//single difference between n and r
				System.out.print("* ");
			}System.out.println();
		}
		System.out.println();
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=i;j++) {		//single difference between n and r
				System.out.print("* ");
			}System.out.println();
		}
	}

	
}
