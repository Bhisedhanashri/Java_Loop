package pattern;
import java.util.Scanner;
public class J {

	public static void main(String[] args) {
		System.out.println("ULTA Triangle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = input.nextInt();
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
