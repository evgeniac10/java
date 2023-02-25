package 자바기초;
import java.util.Scanner;
public class 배열_스터디 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 5개를 입력하시요");		
	
		int array[] = new int[5];
		// 데이터 타입 배열변수이름 [] = 뉴 데이터 타입 [배열길이]
		
		int min = 100000;
		//for(초기화;실행조건;반복 실행)
			for(int i=0; i <=4;i++) {
				array[i]= sc.nextInt();
				if(array[i] < min) {
					min = array[i];
				}
			}System.out.print( min  +"입니다.");			
		}
		
	}


