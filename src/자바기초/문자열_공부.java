package 자바기초;

import java.util.Scanner;

public class 문자열_공부 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char in = sc.next().charAt(0);

		if (in > 64 && in < 90) {
			System.out.println("아스키 코드 ");
		} else if (in < 122 && in > 96) {
			System.out.println("아스키 코드");
		} else {
			System.out.println("노 아스키 코드");
		}
	sc.close();
	}
}
