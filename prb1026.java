import java.util.Arrays;
import java.util.Scanner;

public class prb1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] t = new int[n];
		int rst = 0;
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		Arrays.sort(t);
		for (int i = 0; i < n; i++) {
			a[i] = t[n - i - 1];
		}

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(b);

		for (int i = 0; i < n; i++) {
			rst = rst + a[i] * b[i];
		}

		System.out.println(rst);
	}
}
