import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class prb10815 {
	static boolean flag;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int a[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.valueOf(st.nextToken());
		}
		int m = Integer.valueOf(br.readLine());
		int s[] = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			s[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(a);
		for (int i = 0; i < m; i++) {
			flag = false;
			bSearch(0, a.length - 1, a, s[i]);
			if (flag)
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
		}
	}

	static void bSearch(int l, int h, int[] a, int x) {
		int mid = (l + h) / 2;

		while (l <= h) {
			if (a[mid] == x) {
				flag = true;
				return;
			}
			if(a[mid] > x){
				h = mid-1;
				mid = (l+h)/2;
			}
			else{
				l = mid+1;
				mid = (l+h)/2;
			}
		}
	}
}
