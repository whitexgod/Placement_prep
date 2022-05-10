class B
{
	int b1()
	{
		System.out.println("Hi.");
		return 0;
	}
	void show()
	{
		b1();
	}
}

class A
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.show();
	}
}