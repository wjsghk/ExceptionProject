package ��Ʈ�����ͷ�;

public class Person {
	String name;
	int age;
	public Person(String name,int age) {
		super();//������ �θ�Ŭ������ object ������ ���°�
		this.name = name;
	    this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Person) {
		Person another = (Person)obj;
		return this.name.equals(another.name)&& this.age == another.age;
	}
	return false;
	}
	
	@Override
	public String toString() {
		return "Person[ name=" + name + ", age=" + age + "]"; 
	}
	
	@Override
	public int hashCode() {//�� �ڵ� �����鼭 �ؽ��ڵ尡 �����ϰ� ���´�.
	
		return (this.name+ age).hashCode();  //"ȫ�浿 10".hashcode()
	}
	
	
	
	
}
