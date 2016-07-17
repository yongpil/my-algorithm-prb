import java.util.Scanner;

public class prb1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s1 = "";
		String s2 = "";
		sc.nextLine();
		s1 = sc.nextLine();
		char[] ans = new char[s1.length()];
		if (n > 1) {
			for (int i = 1; i < n; i++) {
				s2 = sc.nextLine();
				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(j) == s2.charAt(j))
						ans[j] = s1.charAt(j);
					else
						ans[j] = '?';
				}
				s1 = "";
				for (int k = 0; k < ans.length; k++) {
					s1 = s1 + ans[k];
				}
			}

			for (int k = 0; k < ans.length; k++) {
				System.out.print(ans[k]);
			}
		}
		else
			System.out.println(s1);
	}
}
