import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수 3개 입력>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b>a && a>c)
		{
			System.out.print("중간 값은 " +a);
		;}
		
		else if (a>b && b>c) {
			System.out.print("중간 값은 " + b);
		}
		else {
			System.out.print("중간 값은 " + c);
		}
		sc.close();}

}
