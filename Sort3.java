import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort3 {

	public static void main(String[] args) throws IOException {
		int[] cnt = new int[10001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			while (cnt[i] > 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		System.out.println(sb);
	}
}//https://www.acmicpc.net/problem/10989