
public class ExceptionTest {
//예외처리 p150  
	//catch문 타입
	//throw문 강제예외
	//throws문 예외선언
	public static void main(String[] args) {
		//예외처리 : 코드상에서 개발자가 실행시 인지할  수 있는 문제점을  해결하는것 
		/*try {
			실행문장;//예외를 발생시킬수 있는 문장을 말하는거
		}catch(예외타입형태) {
			예외처리 구문
		}*/
		
		
//		for(int i=0;i<100;i++) {
//			try {
//			int r= (int)(Math.random()*10);  //0 ~9
//			System.out.println(r);
//			int result = 10/r;  //정수를 0으로 나눌수 없다. 예외발생
//			}catch(ArithmeticException e) {
//			System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");}
//	     }

		
//	int[]arr= new int[5];
//	try {
//	arr[5]= 10;
//	}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("index number 오류");
//	}catch(Exception e) {//타입의 예외를 인지를 못할 때 'Exception'으로 적으면 해결이된다
//	    System.out.println("index number 오류");
//	}finally {
//		//예외발생 유무와 상관없이 실행하는 구문
//		System.out.println("예외발생 유무와 상관없이 실행");
//	}
//	
//	arr[3] = 10;
//	System.out.println(arr[3]);
	
		
	try {
		throw new Exception("고의로 예외발생");
	}catch(Exception e ) {
		System.out.println(e.getMessage());}
	

	}
	//		e.printStackTrace();
	//main() 구문이 끝났다.
	
	void add() {
		try {
			throw new Exception("add() 예외발생");	
		}catch(Exception e) {
			e.printStackTrace();
		}
}//add() 구문이 끝났다*/
	
	static void sub()throws ArithmeticException {//예외선언하기
		throw new ArithmeticException("sub() 예외발생");
	}
	
	
	
	
}

