package pattern;
import java.util.Scanner;
public class X {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ABCD Pyramid");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j= 1;j<=n-i;j++) {
				System.out.print("  ");
			}for(int j = 1;j<=2*i-1;j++) {
				System.out.print((char)(j+64)+" ");
			}System.out.println();
		}
	}

}
