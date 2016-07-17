import java.util.Arrays;
import java.util.Scanner;

public class prb10448 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int a[] = new int[50];
		int d[] = new int[49*49*49+1];
		int u[] = new int[1001];
		int c = 1;

		for (int i = 1; i < 50; i++) {
			a[i] = i * (i + 1) / 2;
		}

		for (int i = 1; i < 50; i++) {
			for (int j = 1; j < 50; j++) {
				for (int k = 1; k < 50; k++) {
					d[c] = a[i]+a[j]+a[k];
					c++;
				}
			}
		}
		
		Arrays.sort(d);
		
		for (int i = 1; i < u.length; i++) {
			if(bi(i,d))
				u[i] = 1;
			else
				u[i] = 0;
		}
		
		for (int t = 0; t < tc; t++) {
			int v = sc.nextInt();
			System.out.println(u[v]);
		}
	}

	private static boolean bi(int k, int[] d) {
		int l = 0;
		int r = d.length-1;
		int m = 0;
		while(l<=r){
			m = (l+r)/2;
			if(d[m] == k){
				return true;
			}else if(d[m] > k){
				r = m - 1;
			}else
				l = m + 1;
		}
		return false;
	}
}
