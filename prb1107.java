import java.util.Scanner;

public class prb1107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int bn[] = new int[b];
		for(int i=0;i<b;i++){
			bn[i] = sc.nextInt();
		}
		
		int min = 1000000;
		int num = 1000000;
		int ans = 0;
		for(int i=0;i<1000000;i++){
			if(c(i,bn)){
				if(min > Math.abs(n-i)){
					min = n-i;
					num = i;
				}
			}
		}
		ans = Math.abs(n-num)+String.valueOf(num).length();
		
		if(ans > Math.abs(n-100))
			ans = Math.abs(n-100);
		
		System.out.println(ans);
	}

	private static boolean c(int i, int[] bn) {
			String s = String.valueOf(i);
			for(int j=0;j<s.length();j++){
				for(int k=0;k<bn.length;k++){
					if(s.charAt(j)-'0' == bn[k])
						return false;
				}
			}
			return true;
	}
}
