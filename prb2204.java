import java.util.Scanner;

public class prb2204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int w = sc.nextInt();
		int a[] = new int[t + 1];
		int d[][] = new int[w + 1][t + 1];

		for (int i = 1; i <= t; i++) {
			a[i] = sc.nextInt();
		}

		int c = 0;
		for (int i = 1; i <= t; i++) {
			if (a[i] == 1) {
				c++;
				d[0][i] = c;
			} else
				d[0][i] = d[0][i - 1];
		}

		for (int i = 1; i <= w; i++) {
			for (int j = 1; j <= t; j++) {
				int k = j - 1;
				while ((k - 1) >= 0 && a[j] == a[k]) {
					k--;
				}
				int temp = 0;
				if(a[j-1] == a[j])
					temp = d[i][j-1]+1;
				else
					temp = d[i][j-1];
				
				d[i][j] = Math.max(d[i - 1][k] + j - k, temp);
			}
		}
		System.out.println(d[w][t]);
	}
}
