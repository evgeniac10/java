package 자바기초;

public class 배열2 {

	public static void main(String[] args) {
		
		
		String [] Group3 = {"박봄" ,"산다라박","씨엘","공민지"};
		for (int i = 0; i < Group3.length; i ++) {
			String Group4 =  Group3 [i];
			System.out.println(Group4 + "이 상담을 받았습니다.")
		;}
		//for(초기화 ; 반복조건 ; 반복실행 )
		
		
		
		String[] Group2 = new String[4];
		//문자열 [배열] 변수이름 = new 4개의문자형 배열
		
		
		Group2[0] = "홍길동";
		System.out.println(Group2.length);
		Group2[1] = "김철수";
		System.out.println(Group2.length);
		Group2[2] = "최영희";
		System.out.println(Group2.length);
		Group2[3] = "박길자";
		System.out.println(Group2.length);
	}
		//변수 [색인] = 
		//출력(변수.변수의개수);
}
