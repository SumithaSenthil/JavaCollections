package ListinJava;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Comparable> lst=new LinkedList<Comparable>();
		lst.add(100);
		lst.add("welvome");
		lst.add(15.5);
		lst.add('A');
		lst.add(true);
		System.out.println(lst);
		System.out.println("size of the list "+lst.size());
		lst.remove(1);
		System.out.println("After removing element "+lst);
		lst.add(2, "python");
		System.out.println("After insert "+lst);
		System.out.println(lst.get(2));
		lst.set(2, "C++");
		System.out.println("After replacing element "+lst);
		System.out.println(lst.contains("C++"));
		System.out.println(lst.contains("C#"));
		System.out.println(lst.isEmpty());
		Iterator<Comparable> it=lst.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		

	}

}
