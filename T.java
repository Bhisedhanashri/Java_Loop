package pattern;
import java.util.Scanner;
public class T {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("reverse ABCD Triangle");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print("  ");
			}for(int j = 1;j<=i;j++){
				System.out.print((char)+(j+64)+" ");
			}System.out.println();
		}
	}

}
