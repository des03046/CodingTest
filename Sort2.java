import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Sort2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);
		for (int value : arr) {
			sb.append(value).append("\n");
		}
		System.out.println(sb);
	}
}//https://www.acmicpc.net/problem/2751