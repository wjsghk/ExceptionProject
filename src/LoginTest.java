import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		String id;
		int password;
		Scanner sc = new Scanner(System.in);
		System.out.println("id �Է� :");
		id = sc.next();
		System.out.println("password �Է� :");
		password = sc.nextInt();
		
		
		if(!id.equals("tis")) {//����ó��//���̵� ����ġ �մϴ�.
		try {
			throw new LoginIdException("���̵� ����ġ �մϴ�.");
		}catch(LoginIdException e) {
			System.out.println("���̵� �ٽ� �Է��ϼ���");
		}
		
		}
		if(password !=1234) {//����ó��//�н����尡 ����ġ �մϴ�.
			try {
				throw new LoginPwException("����� ����ġ �մϴ�.");
			}catch(LoginPwException e) {
				System.out.println("����� �ٽ� �Է��ϼ���");
			}
	    }
		if(id.equals ("tis")&& password ==1234){
			System.out.println("�α��μ���");
		}
		
		
		
		
	}

}
