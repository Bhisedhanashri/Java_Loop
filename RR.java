package pattern;
import java.util.Scanner;
public class RR {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Reverse Stars printing");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int space =0,star=n;
		for(int i= 1;i<=n;i++) {
			for(int j = 1;j<=space;j++) {
				System.out.print("  "); 
			}for(int j= 1;j<=star;j++) {
				System.out.print("* ");
			}space++;
			star--;
			System.out.println();
		}
	}

}
