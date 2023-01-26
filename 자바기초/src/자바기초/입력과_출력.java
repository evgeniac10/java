package 자바기초;
import java.io.FileNotFoundException;
import java.util.Scanner ;

public class 입력과_출력 {

	public static void main(String[] args) {
			
		try {
			File file = new File ("out.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt()) {
				System.out.println(sc.nextInt()*100);
			}
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		sc.close();

			
	}

}
