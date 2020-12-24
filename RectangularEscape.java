import java.util.Arrays;
import java.util.Scanner;

public class RectangularEscape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, w, h, t, k, min;
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		t = w - x;
		k = h - y;
		int arr[] = { x, y, t, k };
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
