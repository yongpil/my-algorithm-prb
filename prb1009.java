import java.util.Scanner;

public class prb1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = 1;
			for(int j=0;j<b;j++){
				ans = (ans*a)%10;
			}
			if(ans==0)
				ans = 10;
			System.out.println(ans);
		}
	}
}
