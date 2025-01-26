package pattern;
import java.util.Scanner;
public class H {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Alphanumeric Triangle");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				if(i%2==1) {
					System.out.print(j+" ");
				}else {
					System.out.print((char)(j+64)+" ");
				}
			}System.out.println();
		}
	}

}
