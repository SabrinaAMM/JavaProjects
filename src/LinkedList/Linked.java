package LinkedList;

import java.util.LinkedList;

import java.util.Iterator;

public class Linked {

	public static void main(String[] args) {
		LinkedList<String> linked = new LinkedList<String>();
		
		linked.add("Anna");
		linked.add("Jessica");
		linked.add("Robin");
		
        System.out.println(linked);
        System.out.println(linked.get(1));
        
        Iterator it = linked.iterator();
        while(it.hasNext()) {
        	if((String) it.next() == "Robin") {
        		System.out.println("Found");
        	}
        }
        
	}

}
