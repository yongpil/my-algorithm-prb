import java.util.Scanner;
import java.util.Stack;

public class prb10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c;
		int cnt = 0;
		int chk = 0;
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == '(') {
				st.push(c);
				chk = 0;
			} else if (c == ')') {
				st.pop();
				if (chk == 0) {
					cnt = cnt + st.size();
					chk = 1;
				} else if (chk == 1)
					cnt = cnt + 1;
			}
		}
		System.out.println(cnt);
	}
}
