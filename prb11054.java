import java.util.Scanner;

public class prb11054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		int d[] = new int[n + 1];
		int asc[] = new int[n + 1];
		int desc[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i < n + 1; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && max < asc[j])
					max = asc[j];
			}
			asc[i] = max + 1;
		}

		for (int i = n; i > 0; i--) {
			int max = 0;
			for (int j = n; i < j; j--) {
				if (a[j] < a[i] && max < desc[j])
					max = desc[j];
			}
			desc[i] = max + 1;
		}

		for (int i = 1; i <= n; i++) {
			d[i] = asc[i] + desc[i] - 1;
		}
		int max = 0;
		for (int i = 1; i <= n; i++) {
			if (max < d[i])
				max = d[i];
		}
		System.out.println(max);
	}
}
