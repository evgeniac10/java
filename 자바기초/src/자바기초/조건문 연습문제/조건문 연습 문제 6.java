package 자바기초;
import java.util.Scanner ;
public class 조건문_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
			if (a >= 10) {
				System.out.println( a + "는 양수이고 10보다 크거나 같다.");
			}
			else if (0<a && a<10)
			{
				System.out.println(a + "는 양수이고 0보다 크고 10보다 작다.");
			}
			else {
				System.out.println(a + "는 음수이고 0보다 작다.");
		}
		}
	}


