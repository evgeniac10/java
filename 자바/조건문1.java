import java.util.Scanner;

public class 조건문1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("형법 점수를 입력해주세요 : "  );
		int a = sc.nextInt(); 
		
		
		System.out.println("형사소송법 점수를 입력해주세요 : "  );
		int b = sc.nextInt();
		
		
		System.out.println("경찰학개론 점수를 입력해주세요 : "  );
		int c = sc.nextInt();
		
		
		System.out.println("영어 점수를 입력해주세요 : "  );
		int d = sc.nextInt();
		
		System.out.println("한국사 점수를 입력해주세요 : "  );
		int e = sc.nextInt();
		
		
		double average = ( a + b + c + d + e )/5;
		
		if (average >= 80){
				if(a <40 || b<40 || c<40 || d<40 || e<40) {
					System.out.print("아쉽지만, 다음 시험에 응시해주세요");
				}
				else {System.out.print ("축하합니다. 합격입니다");}
				
			
		}
		
		
		else {
			System.out.print("아쉽지만, 다음 시험에 응시해주세요");
		}
		
		sc.close();
	}
}
