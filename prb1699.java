import java.util.Scanner;

public class prb1699 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		int min;
		for (int i = 1; i <= n; i++) {
			min=Integer.MAX_VALUE;
			for (int j = 1; j*j <= i; j++) {
				if(min>d[i-j*j]+1)
					min = d[i-j*j]+1;
			}
			d[i] = min;
		}
		System.out.println(d[n]);
	}
}
