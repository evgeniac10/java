package 자바기초;

public class 선후_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 57 ;
		int b = 13 ;
		
//		선증가연산자
		System.out.println("++연산은 " + ++a + " a의 값은 " + a ); 
		
//		후증가연산자
		a  = 57 ;
		System.out.println("연산++ 은 " + a++ + " a의 값은 "+ a );
		
//		선감소연산자
		System.out.println(" --연산은 "+ --b +" b의 값은 " + b );
		
//		후감소연산자 
		b = 13 ;
		System.out.println("연산-- 은 "+ b-- + " b의 값은 " + b );
		
	}

}
