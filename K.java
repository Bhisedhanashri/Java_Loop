package pattern;
import java.util.Scanner;
public class K {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ULTA Triangle with AlphaNumeric");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n+1-i;j++) {
				if(i%2==1) {
					System.out.print((char)(i+64)+" ");
				}else {
					System.out.print(i+" ");
				}
			}System.out.println();
		}
	}

}
