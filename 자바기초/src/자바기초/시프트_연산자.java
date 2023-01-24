package 자바기초;

public class 시프트_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//시프트 연산
		
		byte num1 = 8 ;
		int result1 ;
		byte num2 = 8 ;
		int result2 ;
		
		
		
		result1 = num1 << 2 ; // 2칸 왼쪽으로 이동 
		System.out.println (result1);
		result2 = num2 >> 2 ; // 2칸 오른쪽으로 이동 
		System.out.println(result2);
		
		// 논리 시프트 연산자 
		//-16은 비트단위로 11111111 11111111 11111111 11110000 
		result2 = -16 >>> 3 ; // 3칸 오른쪽으로 이동
		System.out.println(result2);
				
	}

}
