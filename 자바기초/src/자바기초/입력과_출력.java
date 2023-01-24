package 자바기초;
import java.util.Scanner ;

public class 입력과_출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print(i*100);
		sc.close();

	}

}
