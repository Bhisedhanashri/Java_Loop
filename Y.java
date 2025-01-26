package pattern;
import java.util.Scanner;
public class Y {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Star Diamond Ulta");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int space=1,star=2*n-3;
		for(int i= 1;i<=n-1;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j =1; j<=star;j++) {
				System.out.print("* ");
			}
			space++;
			star-=2;
			System.out.println();
		}
	}

}
