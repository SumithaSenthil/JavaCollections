package MapsAndHashMap;

import java.util.HashMap;

public class HashMapinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> lst=new HashMap<String,String>();
		
		lst.put("100", "Selenium");
		lst.put("105", "UFT");
		lst.put("101", "Appium");
		lst.put("104", "PostMan");
		lst.put("108", "Jmeter");
		lst.put("106", "katalon");
		
		System.out.println("Automation Tools "+lst);
		String Tool=lst.get("100");
		System.out.println("The Tool is "+Tool);
		
		
		
		

	}

}
