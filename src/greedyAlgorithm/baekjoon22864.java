package greedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon22864 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int count = 0, p = 0, answer = 0;
		while(count != 24) {
			if(p + A <= M) {
				answer += B;
				p += A;
			}
			else {
				p = p - C < 0 ? 0 : p - C;
			}
			count++;
		}
		System.out.print(answer);
	}
}
