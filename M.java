package pattern;
import java.util.Scanner;
public class M {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Floyd's Triangle");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int a = 1;
		for(int i = 1;i<=n;i++) {
			for(int j= 1;j<=i;j++) {
				if(a<10) {
					System.out.print(a+"  ");
				}
				else {
					System.out.print(a+" ");
				}
				a++;
			}System.out.println();
		}
	}

}
