package 자바기초;
import java.util.Scanner;
public class 배열_스터디2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0 ;
		for(int i=1; i<101; i++) {
			a = i + a;
		}
		System.out.println(a);
	
	}

}
