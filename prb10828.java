import java.util.Scanner;

public class prb10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[10001];
		int sp = -1;
		String c="";
		for(int i=0;i<n;i++){
			c = sc.next();
			if(c.equals("push")){
				sp++;
				s[sp] = sc.nextInt();
			}else if(c.equals("top")){
				if(sp==-1)
					System.out.println(-1);
				else
					System.out.println(s[sp]);
			}else if(c.equals("pop")){
				if(sp==-1)
					System.out.println(-1);
				else{
					System.out.println(s[sp]);
					sp--;
				}
			}else if(c.equals("empty")){
				if(sp==-1)
					System.out.println(1);
				else
					System.out.println(0);
			}else if(c.equals("size"))
				if(sp==-1)
					System.out.println(0);
				else
					System.out.println(sp+1);
		}
	}
}
