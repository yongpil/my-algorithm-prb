import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prb2745 {
	final static int cNum = 55;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String b = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		int temp =0;
		long num = 0;
		for(int i=0;i<b.length();i++){
			if('A'<= b.charAt(i) && b.charAt(i)<='Z')
				temp = b.charAt(i)- cNum;
			else 
				temp = b.charAt(i)-'0';
			num = (long) (num + temp*Math.pow(n,b.length()-i-1));
		}
		System.out.println(num);
	}
}
