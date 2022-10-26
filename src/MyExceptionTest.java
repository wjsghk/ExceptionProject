
public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			throw new MyException("MyException 사용자 정의 예외발생");
		}catch(MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
