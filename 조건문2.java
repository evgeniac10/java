import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
		if (num % 3 == 0 && num % 2 == 0 ) {
			System.out.print("맞습니다.");
		}
		
		else {
			System.out.print("틀립니다.");
		}
		sc.close();
	}

}
