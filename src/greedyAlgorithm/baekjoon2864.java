package greedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class baekjoon2864 {
	public static void main(String[] args) throws IOException {
			

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());

			String a = st.nextToken().replace('6', '5');
			String b = st.nextToken().replace('6', '5');

			System.out.print(Integer.parseInt(a) + Integer.parseInt(b)+" ");

			a = a.replace('5', '6');
			b = b.replace('5', '6');

			System.out.print(Integer.parseInt(a)+Integer.parseInt(b));
	}
}
