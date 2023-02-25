package 자바기초;

import java.util.Scanner;

public class 배열_예제_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		
		String str = sc.next();
		str = str.toLowerCase();
		int count_p = 0;
		int count_y = 0;
		
		
		for(int i=0; i<str.length();i++) 
		{
			if(str.charAt(i)== 'p') 
			{
				count_p++;
			}
			else if(str.charAt(i)== 'y') 
			{
				count_y++;
			}
		}
		if(count_p == count_y) 
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
	}

}
