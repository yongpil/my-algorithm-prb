import java.util.Scanner;

public class prb2846 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] d = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		d[0] = 0;

		for (int i = 1; i < n; i++) {
			if (a[i - 1] < a[i])
				d[i] = d[i - 1] + a[i] - a[i - 1];
			else
				d[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			if (max < d[i])
				max = d[i];
		}

		System.out.println(max);
	}
}
