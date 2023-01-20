import java.util.Scanner; //scanner 클래스 호출;


public class homework1 {

	public static void main(String[] args) {
		
		Scanner hs = new Scanner(System.in);
		
		System.out.println ("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		// 정보를 입력받는다
		
		String name = hs.next();
		String city = hs.next();
		int age = hs.nextInt();
		double weight = hs.nextDouble();
		boolean vacine = hs.nextBoolean();
		
		
		System.out.print("이름은 " + name +",도시는 " + city + ", 나이는 " + age + "살, 체중은 " + weight + "kg, 독신여부는 " + vacine + "입니다.");
		hs.close();
	}
		
}
