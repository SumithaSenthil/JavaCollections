package SetinJava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedHashSet<String> lst=new LinkedHashSet<String>();
		
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
