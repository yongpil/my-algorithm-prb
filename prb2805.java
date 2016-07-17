import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prb2805 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		long m = Long.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long a[] = new long[n];
		long max = 1000000000;
		for (int i = 0; i < n; i++) {
			a[i] = Long.valueOf(st.nextToken());
		}

		bi(0, max, a, m);
	}

	private static void bi(long l, long h, long[] a, long m) {
		long mid = 0;
		long r = 0;
		long ans = 0;
		while (l <= h) {
			mid = (l + h) / 2;
			r = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] > mid)
					r = r + a[i] - mid;
			}
			if (r >= m){
				if(mid > ans)
					ans = (int) mid;
				l = mid + 1;
			}
			else
				h = mid - 1;
		}
		System.out.println(ans);
	}
}
