import java.util.Scanner;

public class prb2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int n = sc.nextInt();
		
		int h2 = n/3600;
		int m2 = n%3600/60;
		int s2 = n%60;
		
		if(s+s2>=60){
			m2 = m2+1;
		}
		if(m+m2>=60){
			h2 = h2+1;
		}
		
		System.out.print((h+h2)%24+" ");
		System.out.print((m+m2)%60+" ");
		System.out.print((s+s2)%60);
	}
}
