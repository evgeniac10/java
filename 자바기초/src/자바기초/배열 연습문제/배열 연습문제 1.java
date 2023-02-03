package 자바기초;

import java.util.Scanner;

public class 이상한_문자_만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] array = input.split("");
		String answer = "";
		int box = 0;
		
		for(int i =0; i<array.length; i++) 
		{
			if(array[i].equals(" ") )
			{
				answer = answer + array[i] ;
				box = 0;
			}
			else 
			{
				if(box % 2 ==0) 
				{
					answer = answer + array[i].toUpperCase();
					box++;
				}
				else 
				{
					answer = answer + array[i].toLowerCase();
					box++;
				}
				
			}
		}
		System.out.print(answer);
	}

}
