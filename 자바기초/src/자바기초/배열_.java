package 자바기초;

public class 배열_ {

	public static void main(String[] args) {
		// 데이터타입 변수명 [] = 뉴 데이터타입[배열의 개수];
	
		// 출력(배열변수명[해당 원소 인덱스]);
		
		
		int [] array = {1,2,3,4,5};
		//데이터 타입 [] 변수명 = {원,소,들,을,넣,는,다};
		String [] array2 = {"원","소","들", "을","넣","는","다"};
		//데이터 타입 [] 변수명 = {원,소,들,을,넣,는,다};
		char [] array3 = {'원','소','들','을','넣','는','다'};
		//데이터 타입 [] 변수명 = {원,소,들,을,넣,는,다};
		
		int array_1 [] = new int[5];
		// 데이터타입 변수명 [] = 뉴 데이터타입[배열의 개수];
		array_1 [0] = 1; 
		// array_1이런 배열 1번째에다가 1이라는 값을 선언한다.
		array_1 [2]= 2;
		// array_1이런 배열 3번째에다가 2이라는 값을 선언한다.
		String array_2[] = new String[7];
		// 데이터타입 변수명 [] = 뉴 데이터타입[배열의 개수];
		char array_3 [] = new char[7];
		System.out.println(array_3.length);
		//array_3이라는 배열의개수를 출력한다.
		
		System.out.print(array_1[2]);
	}

}
