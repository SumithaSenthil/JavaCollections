package ListinJava;

import java.util.ArrayList;

public class ArrayListinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj=new ArrayList<String>();
		
		obj.add("Java");
		obj.add("Python");
		obj.add("C++");
		obj.add("JavaScript");
		String s=obj.get(1);
		System.out.println("The output is "+s);
		System.out.println("The Elements are "+obj);

	}

}
