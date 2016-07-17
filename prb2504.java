import java.util.Scanner;
import java.util.Stack;

public class prb2504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();

		int size = st.length();
		if (isAble(st)) {
			System.out.println(get_result(st));
		} else
			System.out.println(0);
	}

	private static int get_result(String st) {
		Stack<Character> s = new Stack<>();
		int ans = 0;
		int mul = 1;
		int size = st.length();
		for(int i=0;i<size;i++){
			if(st.charAt(i)=='('){
				mul *= 2;
				s.push(st.charAt(i));
				if(st.charAt(i+1)==')')
					ans += mul;
			}
			else if(st.charAt(i)=='['){
				mul *= 3;
				s.push(st.charAt(i));
				if(st.charAt(i+1)==']')
					ans += mul;
			}
			else if(!s.isEmpty() && st.charAt(i)==')'){
				mul /=2;
				s.pop();
			}
			else if(!s.isEmpty() && st.charAt(i)==']'){
				mul /=3;
				s.pop();
			}
		}
		return ans;
	}

	private static boolean isAble(String st) {
		Stack<Character> s = new Stack<>();
		int size = st.length();
		for (int i = 0; i < size; i++) {
			char t = st.charAt(i);
			if (t == '(' || t == '[')
				s.push(t);
			else if (!s.isEmpty() && s.peek() == ('(') && t == ')')
				s.pop();
			else if (!s.isEmpty() && s.peek() == ('[') && t == ']')
				s.pop();
			else
				return false;
		}
		if (s.isEmpty())
			return true;
		else
			return false;
	}
}