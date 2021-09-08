package linkedList;
import java.util.*;
public class linkedlist {
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		getTimeDiff(al);
		getTimeDiff(ll);
		
		System.out.println(ll);
		
		
	}
	
	static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		for(int i = 0  ;  i < 10000; i++) {
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+"--> " + (end - start));
		
	}
}