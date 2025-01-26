package pattern;
import java.util.Scanner;
public class N {

	public static void main(String[] args) {
		System.out.println("0 & 1 Triangle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				if(i%2==1) {
					if(j%2==1)System.out.print(1+" ");
					else System.out.print(0+" ");
				}else {
					if(j%2==0)System.out.print(1+" ");
					else System.out.print(0+" ");
				}
			}System.out.println();
		}
		System.out.println();
		System.out.println("Alternative Method");
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1+" ");
				}else {
					System.out.print(0+" ");
				}
			}System.out.println();
		}
	}

}
