import java.util.*;

public class prb2085_ {
	public static boolean check(long[] a, long mid, long m) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] - mid > 0) {
				sum += a[i] - mid;
			}
		}
		return sum >= m;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] a = new long[n];
		long l = 0;
		long r = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			r = Math.max(r, a[i]);
		}
		long ans = 0;
		while (l <= r) {
			long mid = (l + r) / 2;
			if (check(a, mid, m)) {
				ans = Math.max(ans, mid);
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		System.out.println(ans);
	}
}