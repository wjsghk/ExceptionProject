package 스트링리터럴;

public class Person {
	String name;
	int age;
	public Person(String name,int age) {
		super();//생략된 부모클래스인 object 때문에 나온거
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
	public int hashCode() {//이 코드 나오면서 해쉬코드가 동일하게 나온다.
	
		return (this.name+ age).hashCode();  //"홍길동 10".hashcode()
	}
	
	
	
	
}
