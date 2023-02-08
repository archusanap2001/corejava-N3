package thiskeyword;
class finance
{
	int salary;
	public finance() {
		System.out.println("parent class");
		
	}
	public finance(int salary) {
		this.salary = salary;
		
	}
	void print()
	{
		System.out.println("salary is:"+salary);
	}
}


public class ThisKeywordExample {
	
	public static void main(String[]args)
	{
		finance f=new finance();
		finance f1=new finance(3456);
		f1.print();
	}

}
