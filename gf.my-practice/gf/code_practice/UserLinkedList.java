package gf.code_practice;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}
public class UserLinkedList {
	Node head;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void remove(int data) {
		if(head==null) {	} 
		if(head.data == data) {
			head = head.next;
		}
		
		Node temp = head;
		
		while(temp!=null) {
			if(temp.data == data) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
	}
	
	public void printList() {
		System.out.println("List is :");
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		UserLinkedList list = new UserLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);;
		list.add(5);
		list.printList();
		//3rd index is removed
		list.remove(3);
		list.printList();
	}
	
}
