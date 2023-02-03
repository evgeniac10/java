package 자바기초;

import java.util.Arrays;
import java.util.Scanner;

public class 배열_스터디3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int array[] = new int [5];	
		for(int i=0; i<5; i++) {
			array[i] = input % 10;
			input =input/10;
		}
		System.out.print(Arrays.toString(array));
	}
}
