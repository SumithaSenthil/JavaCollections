package ListinJava;

import java.util.Collections;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("X");
		lst.add("Y");
		lst.add("Z");
		lst.add("A");
		lst.add("B");
		lst.add("C");
		
		LinkedList<String> lst1=new LinkedList<String>();
		lst1.addAll(lst);
		System.out.println(lst1);
		lst1.removeAll(lst);
		System.out.println("After Removing "+lst1);
		System.out.println("Element in linked list "+lst);
		Collections.sort(lst);
		System.out.println("Element in linked list after sorting "+lst);
		Collections.sort(lst,Collections.reverseOrder());
		System.out.println("Element in linked list after reversing "+lst);
		Collections.shuffle(lst);
		System.out.println("Element in linked list after Shuffle "+lst);

	}

}
