package 자바기초;

import java.util.Scanner;

public class 에라토스테네스의체 { // true는 소수가 아닌 수 , false는 소수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		boolean arr[] = new boolean[num + 1];

		arr[0] = true;
		arr[1] = true;

		for (int i = 2; i < Math.sqrt(arr.length); i++) {
			for (int j = i * i; j < arr.length; j = j + i) {
				arr[j] = true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i])
				System.out.println(i);
		}
	}

}
