package pattern;
import java.util.Scanner;
public class S {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Reverse Numbers Triangle");
		System.out.print("Enter n: ");
		int n= input.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
		System.out.println();
		System.out.println("Another Loop We Create");
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=n-i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
