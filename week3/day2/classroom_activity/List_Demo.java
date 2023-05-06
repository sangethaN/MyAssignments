package week3.day2.classroom_activity;

import java.util.*;

public class List_Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Alpha");
		list.add("Sigma");
		list.add("Shrikanth");
		list.add("Delta");
		list.add("Gamma");
		list.add("Shilpa");
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			
		String s= list.get(i);
		    if(s.startsWith("S"))
		    {
		        System.out.println(list.get(i));
		    }}
		list.add("Pie");
		System.out.println(list);
		System.out.println(list.size());
		list.add("Pie");
		System.out.println(list);
		list.add(3, "Choco");
		System.out.println(list);
		list.set(1,"Zudio");
		System.out.println(list);
		list.remove("Pie");
		System.out.println(list);

	}

}
