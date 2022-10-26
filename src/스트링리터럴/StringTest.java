package 스트링리터럴;

public class StringTest {
//p359  가장많이 사용하는 것들 (charAt,subString,indexof,equals,valueof)
	public static void main(String[] args) {
//		String str1 = "abc";
//		String str2 = "def";
//		
//		str1 = str1 +str2;//"abcdef"가 나온다
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
		
		
		
//		String str3 = new String("abc");
//		String str4 = new String("abc");
//		if(str3.equals(str4)) {//=if(abc.equals(abc))
//			System.out.println("같은 문자열이다.");
//		}else {
//			System.out.println("다른 문자열이다.");}//같은문자열이다
//		//위에 equals랑 비교하기
//		if(str3==str4) {//주소값
//			System.out.println("같은 문자열이다.");
//		}else {
//			System.out.println("다른 문자열이다.");}//다른문자열이다.
//		
//		int x = 10;
//			String str = String.valueOf(x);
//			System.out.println(str);//10이 나온다.
//			System.out.println(str.charAt(0));//1이나온다 <=첫번째 배열이라   ,(1)일경우에는 0이 나온다
		
			
			
		//p364
		StringBuffer sb= new StringBuffer("abc");
		System.out.println(sb);//abc
		sb.append("def");
		System.out.println(sb);//abcdef
			
		
		
		
//		String fileName = "Hello.java"; 
//		                // 0123456789  => 글자위치를 나타냄
//		char c = fileName.charAt(0);//   .chatAt=>배열위치 글자를 한 개를 출력한다.
//		System.out.println(c);//'H'
//				
//		for(int i=0;i<fileName.length();i++) {
//			System.out.println(fileName.charAt(i));
//		}
//		String str = fileName.substring(0,5);
//		System.out.println(str);//Hello
//		String str2 = fileName.substring(6,10);//마무리 글자위치가 9여서  숫자가 오바되도 9로 인식한다
//		System.out.println(str2);//java
//		String str3 = fileName.substring(3);
//		System.out.println(str3);//lo.java
		
		
		String fileName = "Hello.java";
//    0123456789  => 글자위치를 나타냄  *index,substring
		int index = fileName.indexOf('.');//5   
		System.out.println(fileName.substring(0,index));//Hello
		System.out.println(fileName.substring(index+1));//java
	
	}

}
