import java.util.Scanner;

public class prb1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []hex = {"000","001","010","011","100","101","110","111"};
		String s = sc.nextLine();
		int n = s.length();
		System.out.print(Integer.toBinaryString(s.charAt(0)-'0'));
		for (int i = 1; i < n; i++) {
			switch(s.charAt(i)){
				case '0' :
				System.out.print(hex[0]);  break;
				case '1' :
					System.out.print(hex[1]); break;
				case '2' :
					System.out.print(hex[2]); break;
				case '3' :
					System.out.print(hex[3]); break;
				case '4' :
					System.out.print(hex[4]); break;
				case '5' :
					System.out.print(hex[5]); break;
				case '6' :
					System.out.print(hex[6]); break;
				case '7' :
					System.out.print(hex[7]); break;
			}

		}
	}
}
