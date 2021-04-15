package gdu.ch065;

public class SngletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		
		Person a3 = new Person();
		Person a4 = new People();
		
		System.out.println("a1 : "+ a1.hashCode());
	}

}

	class Person {
		private Person() {}
		public Person p = new Person();
		private static Person p = new Person();
		public People() {}
		
		public Static Person getInstance() {
			return Person p;
		}
	}

	class A {
		
	}
