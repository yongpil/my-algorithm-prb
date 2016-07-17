import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prb10942 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());

		int a[] = new int[n];
		int d[][] = new int[n][n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			a[i] = Integer.valueOf(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			for (int y = 0, x = i; y < n - i; y++, x++) {
				if (x == y)
					d[x][y] = 1;
				else if (Math.abs(x - y) == 1) {
					if (a[x] == a[y])
						d[x][y] = 1;
					else
						d[x][y] = 0;
				} else {
					if (a[x] == a[y] && d[x - 1][y + 1] == 1)
						d[x][y] = 1;
					else
						d[x][y] = 0;
				}
			}
		}
		int m = Integer.valueOf(br.readLine());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			sb.append(d[y-1][x-1]+"\n");
		}
		System.out.println(sb);
	}
}
