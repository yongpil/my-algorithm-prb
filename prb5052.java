import java.util.Arrays;
import java.util.Scanner;

public class prb5052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			boolean c = true;
			String[] num = new String[n];
			for (int i = 0; i < n; i++) {
				num[i] = sc.next();
			}
			Arrays.sort(num);

			for (int i = 0; i < n-1; i++) {
				if (num[i].length() > num[i + 1].length())
					continue;
				if (num[i].equals(num[i + 1].substring(0, num[i].length()))) {
					c = false;
					break;
				}
			}
			if (c == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
