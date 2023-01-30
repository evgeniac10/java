package 자바기초;
import java.util.Arrays;
import java.util.Scanner;

public class 최소공배수_최대공약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열 맨앞에 최대 공약수 , 최소 공배수
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0 ;
		int min = 0;
		for(int i = 1; i<=m && i<=n ; i++) 
		{
			if( n % i ==0 &&  m % i ==0) 
			{
				 max = i ;
			}
		}
		min = max * (n/ max) * (m/max);
		System.out.print(min);
		
		
		
		
		
	}

}
