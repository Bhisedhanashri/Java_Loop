package pattern;
import java.util.Scanner;
public class Q {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Cross Star");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(j ==i || j ==(n-i+1)) {
					System.out.print("* ");
				}else {
					System.out.print("# ");
				}
			}System.out.println();
		}
		
		System.out.println();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(j ==i || j ==(n-i+1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		System.out.println();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(j ==i || j ==(n-i+1)) {
					System.out.print("  ");
				}else {
					System.out.print("# ");
				}
			}System.out.println();
		}
	}

}
