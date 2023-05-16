package MapsAndHashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Treemapinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
TreeMap<String,String> lst=new TreeMap<String,String>();
		
		lst.put("100", "Selenium");
		lst.put("101", "UFT");
		lst.put("105", "Appium");
		lst.put("108", "PostMan");
		lst.put("109", "Jmeter");
		lst.put("106", "katalon");
		
		System.out.println("Automation Tools "+lst);
		String Tool=lst.get("100");
		System.out.println("The Tool is "+Tool);
		
		

	}

}
