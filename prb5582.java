import java.util.Scanner;

public class prb5582 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		int d[][] = new int[s1.length()][s2.length()];
		int max = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					if (i - 1 > -1 && j - 1 > -1)
						d[i][j] = d[i - 1][j - 1] + 1;
					else
						d[i][j] = 1;
				} else
					d[i][j] = 0;
				if (max < d[i][j])
					max = d[i][j];
			}
		}
		System.out.println(max);
	}
}
