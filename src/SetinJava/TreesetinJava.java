package SetinJava;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreesetinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       TreeSet<String> lst=new TreeSet<String>();
		
		lst.add("Java");
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
