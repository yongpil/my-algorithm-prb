import java.util.Scanner;

public class prb11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int c = 0;
		int r = 0;
		for (int i = n-1; i > -1; i--) {
			r = k / a[i];
			if (r != 0) {
				k = k - r * a[i];
				c = c + r;
			}
		}
		System.out.println(c);
	}
}
