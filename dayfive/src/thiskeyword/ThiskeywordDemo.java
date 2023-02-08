package thiskeyword;
class Account{
	int a;
	int b;
	public void setdata(int a,int b) {
		this.a=a;
		this.b=b;
		
		
		
		
	}
	public void showdata() {
		System.out.println("value of A="+a);
		System.out.println("value of b="+b);
	}
}

public class ThiskeywordDemo {
	public static void main(String args[])
	{
		Account obj =new Account();
		obj.setdata(4, 9);
		obj.showdata();
	}

}
 