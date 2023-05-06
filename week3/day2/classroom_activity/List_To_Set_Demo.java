package week3.day2.classroom_activity;

import java.util.*;

public class List_To_Set_Demo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Shakthi");
		list.add("George");
		list.add("Arun");
		list.add("Chandru");
		list.add("Eshwar");
		list.add("Bala");
		list.add("Farook");
		list.add("Arun");
		list.add("Bala");
		System.out.println(list);
		System.out.println("duplicate values: ");
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j))
					System.out.print(list.get(i)+" ");
				
			}
		}
		Set<String> HashVal =new HashSet<String>();
		HashVal.addAll(list);
		System.out.println("Set value"+HashVal);
		
		Set<String> TreeVal = new TreeSet<String>();
		TreeVal.addAll(list);
		System.out.println("Tree value"+TreeVal);
		
		Set<String> LinkHash = new LinkedHashSet<String>();
		LinkHash.addAll(list);
		System.out.println("Linked Hash value"+ LinkHash);
	}
}
