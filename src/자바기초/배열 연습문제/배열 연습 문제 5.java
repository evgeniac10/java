package 자바기초;

import java.util.Scanner;

public class 배열_복습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 5개를 입력하세요.");
		int array [] = new int [5];
		int min = 100000;

		for(int i=0; i<5;i++) {
			array[i] = sc.nextInt();
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.print("가장 작 수는 "+ min + "입니다.");
	}

}
