package pattern;
import java.util.Scanner;
public class D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ABCD Square");
		System.out.print("Enter n : ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(j+96)+" ");
			}System.out.println();
		}
		System.out.println();
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(j+64)+" ");
			}System.out.println();
		}
	}

}
