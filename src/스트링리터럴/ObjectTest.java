package 스트링리터럴;
//person클래스와 같이 공부하기
public class ObjectTest {

	public static void main(String[] args) {
		Person p1 =new Person("홍길동",10);
		Person p2 =new Person("홍길동",10);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println("------------");
		
		
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("------------");
		
		
		
		
		if(p1.equals(p2)) {//"홍길동"=="홍길동"
			System.out.println("같은사람");
		}else {
			System.out.println("다른사람");
		}
	
	
	}
	

}
