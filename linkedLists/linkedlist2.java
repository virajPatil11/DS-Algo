package linkedList;
import java.util.*;
public class linkedlist2 {
	
	
	Node head;
	
	void add(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) { }
		temp.next = toAdd;
	}
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
}
