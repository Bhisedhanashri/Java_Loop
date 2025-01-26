package pattern;
import java.util.Scanner;
public class O {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Star Plus");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int mid = (n/2)+1;
		System.out.println("Pattern 1");
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(i==mid || j==mid) {
					System.out.print("* ");
				}else {
					System.out.print("# ");
				}
			}System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 2");
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(i==mid || j==mid) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 3");
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(i==mid || j==mid) {
					System.out.print("  ");
				}else {
					System.out.print("# ");
				}
			}System.out.println();
		}
	}

}
