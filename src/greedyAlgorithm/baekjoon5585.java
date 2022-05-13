package greedyAlgorithm;

import java.util.Scanner;

public class baekjoon5585 {
	public static void main(String[] args) {
		int N;
		
		int count = 0;
		int arr []= {500,100,50,10,5,1};
		
		Scanner sc = new Scanner(System.in);		
		N = sc.nextInt();
		int K=1000-N;
		for (int i=0; i<arr.length; i++) {
			count += K / arr[i];
			K %= arr[i];
		}
		System.out.println(count);
		
	}
}
