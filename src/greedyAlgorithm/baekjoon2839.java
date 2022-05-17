package greedyAlgorithm;

import java.util.Scanner;

public class baekjoon2839 {
	public static void main(String[] args) {
		int N;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		while(true) {
			if(N%5==0) {
				cnt += N/5;
				System.out.println(cnt);
				break;
			}else {
				N -= 3;
				cnt+=1;
			}
			if(N<0) {
				System.out.println("-1");
				break;
			}
		}
	}	
}