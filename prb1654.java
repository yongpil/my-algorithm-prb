import java.util.Scanner;

public class prb1654 {
	static int k;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		n = sc.nextInt();
		long a[] = new long[k];

		for (int i = 0; i < k; i++) {
			a[i] = sc.nextInt();
		}
		bi(0, Integer.MAX_VALUE, a);
	}

	private static void bi(long l, long r, long[] a) {
		long m = 0;
		long x;
		long ans = 0;
		while (l <= r) {
			x = 0;
			m = (l + r) / 2;
			for (int i = 0; i < k; i++) {
				x = x + a[i] / m;
			}
			if (x >= n) {
				if (m > ans)
					ans = m;
				l = m + 1;
			} else {
				r = m - 1;
			}
		}

		System.out.println(ans);
	}
}
