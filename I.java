package pattern;
import java.util.Scanner;
public class I {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ULTA Triangle");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = n;i>=1;i--) {		//with post decrement operator
			for(int j =1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
		System.out.println();
		System.out.println("Alternative Idea");
		for(int i = 1;i<=n;i++) {
			for(int j =1;j<=n+1-i;j++) {		//with using formula n+1-i
				System.out.print("* ");
			}System.out.println();
		}
	}

}
//i = row 
//j = column