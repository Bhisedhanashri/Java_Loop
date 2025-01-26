package pattern;
import java.util.Scanner;
public class R {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Triangle Reverse");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {		//By the square Method
				if(i+j<=n) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}System.out.println();
		}
		System.out.println("Alternative Method Spaces Loop"); 	//By triangle Method
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {		
				System.out.print("# ");
			}
			for(int j = 1;j<=i;j++) {		
				System.out.print("* ");
			}System.out.println();
		}
		System.out.println();
		System.out.println("Alternative Method without Spaces Loop"); 	//By triangle Method

		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {		
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++) {	
				System.out.print("* ");
			}System.out.println();
		}
		System.out.println();
		System.out.println("Alternative Method star loop"); 	//By triangle Method
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {		
				System.out.print("* ");
			}System.out.println();
		}
	}

}
