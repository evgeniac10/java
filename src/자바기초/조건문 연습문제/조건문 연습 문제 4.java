package 자바기초;

import java.util.Scanner;

public class 수박수박수박 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String soo = "수" ;
		String bak = "박" ;
			for(int i=0; i<n; i++) 
			{
				if(i%2 ==0) 
				{
					System.out.print(soo);
				}
				else 
				{
					System.out.print(bak);
				}
			}
	}

}
