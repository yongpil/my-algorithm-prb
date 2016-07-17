import java.util.Scanner;
import java.util.Stack;

public class prb9935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		StringBuilder rst = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			int y = p.length() - 1;
			stack.push(x);
			if (stack.size() >= p.length() && x == p.charAt(y)) {
				boolean isBomb = true;
				for (int j = 0; j < p.length(); j++) {
					if (p.charAt(y - j) != stack.get(stack.size() - 1 - j)) {
						isBomb = false;
						break;
					}
				}
				if (isBomb) {
					for (int j = 0; j < p.length(); j++)
						stack.pop();
				}
			}
		}

		int size = stack.size();
		if (stack.isEmpty())
			System.out.println("FRULA");
		else {
			for (int i = 0; i < size; i++)
				rst.append(stack.pop());
		}
		System.out.println(rst.reverse());
	}
}
