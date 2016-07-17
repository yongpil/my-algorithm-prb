import java.util.Scanner;

public class prb1924 {
	public static void main(String[] args) {
		String day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int days = 0;

		for (int i = 1; i < x; i++) {
			if (i == 4 || i == 6 || i == 9 || i == 11)
				days = days + 30;
			else if (i == 2)
				days = days + 28;
			else
				days = days + 31;
		}

		days = days + y;
		
		System.out.println(day[days%7]);

	}
}
