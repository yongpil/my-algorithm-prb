import java.util.Scanner;

public class prb10973 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		if (pre_permutation(a, n)) {
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
		}else
			System.out.println(-1);
	}

	private static boolean pre_permutation(int[] a, int n) {
		int i = n - 1;
		while (i > 0 && a[i - 1] <= a[i])
			i -= 1;
		if (i <= 0)
			return false;
		int j = n - 1;
		while (a[j] >= a[i - 1])
			j -= 1;
		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;
		j = n - 1;
		while (i < j) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			i += 1;
			j -= 1;
		}
		return true;
	}
}
