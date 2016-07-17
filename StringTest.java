
public class StringTest {
	public static void main(String[] args) {
		String s = new String("hello");
		s.concat("world");
		System.out.println(s);
		
		StringBuffer br = new StringBuffer("hello");
		br.append("world");
		System.out.println(br);
	}
}
