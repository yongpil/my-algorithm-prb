import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class prb1920 {
	private static boolean flag;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int d[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			d[i] = Integer.valueOf(st.nextToken());
		}
		int m = Integer.valueOf(br.readLine());
		st = new StringTokenizer(br.readLine());
		int s[] = new int[m];
		for (int i = 0; i < m; i++) {
			s[i] = Integer.valueOf(st.nextToken());
		}

		Arrays.sort(d);
		for (int i = 0; i < m; i++) {
			flag = false;
			bSearch(0, d.length-1, d, s[i]);
			if (flag == true)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	private static void bSearch(int f, int l, int[] d, int k) {
		while (f <= l) {
			int mid = (f + l) / 2;

			if (d[mid] == k) {
				flag = true;
				break;
			}
			if (d[mid] < k)
				f = mid + 1;
			else
				l = mid - 1;
		}
	}
}
