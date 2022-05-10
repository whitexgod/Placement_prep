import java.lang.*;

interface A {
	void sum(int x, int y);
}

class B implements A{
	public void sum(int x, int y){
		System.out.println("Sum = "+ (x+y));
	}
}

class Interface2 {
	public static void main(String[] args) {
		B object = new B();
		object.sum(6,9);
	}
}