package 자바기초;

import java.util.Arrays;
import java.util.Scanner;

public class 배열_예제_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int array[] = new int [n];
		
		for(int i=0; i<n; i++)
		{
			int j= i+1;
			array [i] = x * j;
		}
		System.out.print(Arrays.toString(array));
	}

}
