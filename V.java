package pattern;
import java.util.Scanner;
public class V {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Star Pyramid");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.println("Without spaces");
		for(int i = 1;i<=n;i++) {
//			for(int j= 1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
			for(int j= 1;j<=2*i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("With spaces Method 1");
		for(int i = 1;i<=n;i++) {
			for(int j= 1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j= 1;j<=2*i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("With another Method 2" );
		int space=n-1, start=1;
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=space;j++) {
				System.out.print("  ");
			}for(int j= 1;j<=start;j++) {
				System.out.print("* ");
			}
			space--;	
			start+=2;	
			
			System.out.println();
		}
	}

}
