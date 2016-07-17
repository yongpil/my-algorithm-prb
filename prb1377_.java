import java.util.Scanner;
import java.util.Stack;

public class prb1377_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		int cnt = 0;
		Stack<Integer> s = new Stack<>();
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		s.add(a[1]);
		for(int i=2;i<=n;i++){
			int temp=0;
			if(s.peek()>a[i]){
				s.add(a[i]);
			}
			else{
				if(temp>a[i]){
					cnt++;
					temp = a[i];
				}
				s.pop();
				s.add(a[i]);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
