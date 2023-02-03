package 자바기초;

// 	리팩토링을 할수있는 코딩이 잘 만든 코딩이다.
	
	
class Calculater {
	static int base = 0 ;
	int left , right ;

	public void setOprands(int left , int right) {
			this.left = left ;
			this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right + base );
	}
	public void avg() {
		System.out.println((this.left+this.right + base ) / 2);
		
	}
}
public  class CalculatorDemo {
	
		public static void main (String[] args) {
			
			Calculater c1 = new Calculater();
			c1.setOprands(10, 20);
			c1.sum();
			c1.avg();
		
	
			Calculater c3 = new Calculater();
			c3.setOprands(30, 60);
			c3.sum();
			c3.avg();

			Calculater.base=10 ;
			c1.sum();
			c1.avg();
			c3.sum();
			c3.avg();
		}
}
	


