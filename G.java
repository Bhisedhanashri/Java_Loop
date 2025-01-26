package pattern;
import java.util.Scanner;
public class G {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Right Angled Triangle Of ABCD");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=i;j++) {
				System.out.print((char)(i+64)+" ");
			}System.out.println();
		}
	}

}
