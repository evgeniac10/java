package 자바기초;

import java.util.Scanner;

public class 가운데_글자_가져오기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		String input = sc.next();
		String answer ="";
		if(input.length() % 2 ==0) //짝수일때
		{
			int index1 = input.length() / 2 ;
			int index2 = input.length() / 2 -1;
			answer = answer + input.charAt(index2) + input.charAt(index1)  ;
		}
		else //홀수일때
		{
			answer = answer + input.charAt(input.length() / 2) ;
		}
		System.out.print(answer);
	}

}
