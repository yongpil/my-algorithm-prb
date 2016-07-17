import java.util.Scanner;

public class prb1182 {
	static int a[];
	static int f[];
	static int s, cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s = sc.nextInt();
		a = new int[n];
		f = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		pSet(n, 0);
		System.out.println(cnt);
	}

	private static void pSet(int n, int d) {
		if (n == d) {
			int sum = 0;
			boolean c = false;
			for (int i = 0; i < a.length; i++) {
				if (f[i] == 1)
					sum = sum + a[i];
				if (f[i] == 1)
					c = true;
			}
			if (s == sum && c == true) {
				cnt++;
			}
			return;
		}
		f[d] = 1;
		pSet(n, d + 1);
		f[d] = 0;
		pSet(n, d + 1);
	}
}
