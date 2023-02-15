package org.tnsif.staticdemo;

//driver class
public class StaticBlockExecute {

	public static void main(String[] args) {
		System.out.println(StatcBlock.getName());
		
		StatcBlock s=new StatcBlock();
		s.setNum(45);
		System.out.println(s.getNum());
		

	}

}
