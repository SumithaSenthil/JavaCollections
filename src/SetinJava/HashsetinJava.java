package SetinJava;

import java.util.HashSet;

public class HashsetinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> lst=new HashSet<String>();
		
		lst.add("java");
		lst.add("JavaScript");
		lst.add("C++");
		lst.add("C");
		lst.add("Python");
		lst.add("React");
		System.out.println("The Elements are "+lst);
		
		for (String val:lst) {
			System.out.println("The values are "+val);
		}
		

	}

}
