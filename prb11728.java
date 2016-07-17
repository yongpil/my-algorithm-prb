import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prb11728 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int a[] = new int[n];
		int b[] = new int[m];
		int r[] = new int[n + m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.valueOf(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			b[i] = Integer.valueOf(st.nextToken());
		}

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				r[k] = a[i];
				k++;
				i++;
			} else {
				r[k] = b[j];
				k++;
				j++;
			}
		}
		while (i < n) {
			r[k] = a[i];
			k++;
			i++;
		}
		while (j < m) {
			r[k] = b[j];
			k++;
			j++;
		}
		for (int p = 0; p < r.length; p++) {
			sb.append(r[p]+" ");
		}
		System.out.println(sb.toString());
	}
}
