import java.util.Scanner;

public class prb2266 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int y = n;
		int cnt = 0;
		while (k > 1) {
			if(y==1)
				break;
			y = (1+y) / 2;
			k--;
			cnt++;
		}
		System.out.println(y + cnt);
	}
}
