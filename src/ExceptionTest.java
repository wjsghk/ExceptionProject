
public class ExceptionTest {
//����ó�� p150  
	//catch�� Ÿ��
	//throw�� ��������
	//throws�� ���ܼ���
	public static void main(String[] args) {
		//����ó�� : �ڵ�󿡼� �����ڰ� ����� ������  �� �ִ� ��������  �ذ��ϴ°� 
		/*try {
			���๮��;//���ܸ� �߻���ų�� �ִ� ������ ���ϴ°�
		}catch(����Ÿ������) {
			����ó�� ����
		}*/
		
		
//		for(int i=0;i<100;i++) {
//			try {
//			int r= (int)(Math.random()*10);  //0 ~9
//			System.out.println(r);
//			int result = 10/r;  //������ 0���� ������ ����. ���ܹ߻�
//			}catch(ArithmeticException e) {
//			System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");}
//	     }

		
//	int[]arr= new int[5];
//	try {
//	arr[5]= 10;
//	}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("index number ����");
//	}catch(Exception e) {//Ÿ���� ���ܸ� ������ ���� �� 'Exception'���� ������ �ذ��̵ȴ�
//	    System.out.println("index number ����");
//	}finally {
//		//���ܹ߻� ������ ������� �����ϴ� ����
//		System.out.println("���ܹ߻� ������ ������� ����");
//	}
//	
//	arr[3] = 10;
//	System.out.println(arr[3]);
	
		
	try {
		throw new Exception("���Ƿ� ���ܹ߻�");
	}catch(Exception e ) {
		System.out.println(e.getMessage());}
	

	}
	//		e.printStackTrace();
	//main() ������ ������.
	
	void add() {
		try {
			throw new Exception("add() ���ܹ߻�");	
		}catch(Exception e) {
			e.printStackTrace();
		}
}//add() ������ ������*/
	
	static void sub()throws ArithmeticException {//���ܼ����ϱ�
		throw new ArithmeticException("sub() ���ܹ߻�");
	}
	
	
	
	
}

