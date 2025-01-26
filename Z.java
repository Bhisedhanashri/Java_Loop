package pattern;
import java.util.Scanner;
public class Z {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Star Diamond");
		System.out.print("Enter n: ");
		int n = input.nextInt();
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
		 space=1;
		 start=2*n-3;
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=space;j++) {
				System.out.print("  ");
			}for(int j= 1;j<=start;j++) {
				System.out.print("* ");
			}
			space++;	
			start-=2;	
			
			System.out.println();
		}
	}

}
