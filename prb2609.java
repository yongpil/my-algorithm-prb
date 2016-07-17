import java.util.Scanner;

public class prb2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0 && m%i==0)
				x=i;
		}
		
		System.out.println(x);
		System.out.println((n/x)*(m/x)*x);
	}
}
