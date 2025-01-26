package pattern;
import java.util.Scanner;
public class P {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hollow Rectangle");
		System.out.print("Enter m: ");
		int m= input.nextInt();
		System.out.print("Enter n: ");
		int n= input.nextInt();
		for(int i = 1;i<=m;i++) {
			for(int j = 1;j<=n;j++) {
				if(i==1 || i==m || j==1 || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}

}
