
public class binarySch {
	public static void main(String[] args) {
		int[] a = {1, 1, 2, 2, 3, 3};
		bSearch(0,a.length,2,a);
	}

	private static void bSearch(int l, int h, int k, int[] d) {
		int r = 0;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (d[mid] == k) {
				r = mid;
			} else if (d[mid] < k) {
				l = mid + 1;
			} else
				h = mid - 1;
		}
		System.out.println(r);
	}
}
