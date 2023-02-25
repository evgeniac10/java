import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		
		
		
		System.out.print("정수 3개를 입력하시오>> ");
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b > c && a+c >b && b+c > a ) 
			{
			System.out.print("삼각형이 됩니다.");	
			}
		
		else {
			
		;}
		sc.close();	}
	
	}

 
