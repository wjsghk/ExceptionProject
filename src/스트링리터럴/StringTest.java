package ��Ʈ�����ͷ�;

public class StringTest {
//p359  ���帹�� ����ϴ� �͵� (charAt,subString,indexof,equals,valueof)
	public static void main(String[] args) {
//		String str1 = "abc";
//		String str2 = "def";
//		
//		str1 = str1 +str2;//"abcdef"�� ���´�
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
		
		
		
//		String str3 = new String("abc");
//		String str4 = new String("abc");
//		if(str3.equals(str4)) {//=if(abc.equals(abc))
//			System.out.println("���� ���ڿ��̴�.");
//		}else {
//			System.out.println("�ٸ� ���ڿ��̴�.");}//�������ڿ��̴�
//		//���� equals�� ���ϱ�
//		if(str3==str4) {//�ּҰ�
//			System.out.println("���� ���ڿ��̴�.");
//		}else {
//			System.out.println("�ٸ� ���ڿ��̴�.");}//�ٸ����ڿ��̴�.
//		
//		int x = 10;
//			String str = String.valueOf(x);
//			System.out.println(str);//10�� ���´�.
//			System.out.println(str.charAt(0));//1�̳��´� <=ù��° �迭�̶�   ,(1)�ϰ�쿡�� 0�� ���´�
		
			
			
		//p364
		StringBuffer sb= new StringBuffer("abc");
		System.out.println(sb);//abc
		sb.append("def");
		System.out.println(sb);//abcdef
			
		
		
		
//		String fileName = "Hello.java"; 
//		                // 0123456789  => ������ġ�� ��Ÿ��
//		char c = fileName.charAt(0);//   .chatAt=>�迭��ġ ���ڸ� �� ���� ����Ѵ�.
//		System.out.println(c);//'H'
//				
//		for(int i=0;i<fileName.length();i++) {
//			System.out.println(fileName.charAt(i));
//		}
//		String str = fileName.substring(0,5);
//		System.out.println(str);//Hello
//		String str2 = fileName.substring(6,10);//������ ������ġ�� 9����  ���ڰ� ���ٵǵ� 9�� �ν��Ѵ�
//		System.out.println(str2);//java
//		String str3 = fileName.substring(3);
//		System.out.println(str3);//lo.java
		
		
		String fileName = "Hello.java";
//    0123456789  => ������ġ�� ��Ÿ��  *index,substring
		int index = fileName.indexOf('.');//5   
		System.out.println(fileName.substring(0,index));//Hello
		System.out.println(fileName.substring(index+1));//java
	
	}

}
