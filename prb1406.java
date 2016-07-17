import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class prb1406 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		String st = br.readLine();
		int n = Integer.valueOf(br.readLine());

		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();

		for (int i = 0; i < st.length(); i++) {
			s1.add(st.charAt(i));
		}

		char c;
		StringTokenizer t;
		for (int i = 0; i < n; i++) {
			t = new StringTokenizer(br.readLine());
			c = t.nextToken().charAt(0);
			switch (c) {
			case 'P':
				char x = t.nextToken().charAt(0);
				s1.add(x);
				break;
			case 'L':
				if (!s1.isEmpty())
					s2.add(s1.pop());
				break;
			case 'B':
				if (!s1.isEmpty())
					s1.pop();
				break;
			case 'D':
				if (!s2.isEmpty())
					s1.add(s2.pop());
				break;
			}
		}
		int s1Len = s1.size();
		for (int i = 0; i < s1Len; i++) {
			sb1.append(s1.pop());
		}
		int s2Len = s2.size();
		for (int i = 0; i < s2Len; i++) {
			sb2.append(s2.pop());
		}
		System.out.println(sb1.reverse().toString() + sb2.toString());
	}
}
