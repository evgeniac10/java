import java.util.Scanner;
public class homework2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요:" );
		int time = sc.nextInt();
		int hour = time / 3600;
		int minute = ( time % 3600 ) / 60 ;
		int second = ( time % 3600 ) % 60 ;
		
		System.out.print( time + "초는 ");
		System.out.print( hour + "시간, ");
		System.out.print( minute + "분, ");
		System.out.print( second + "초입니다.");
		
		sc.close();
	}

}
