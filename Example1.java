class Example1 
{
	static{
		System.out.println("Example class is loaded");
	}
	static void m1(){
		System.out.println("Example m1");
	}
}
class Sample
{
    static{
		System.out.println("Sample class is loaded");
	}

	public static void main(String[] args) 
	{
		System.out.println("Sample main start");
		Example1.m1();
		System.out.println("end of sample main");
	}
}
