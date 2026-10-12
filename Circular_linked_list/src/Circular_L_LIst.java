
public class Circular_L_LIst {
	static Node head=null;
	static Node tail=null;
	public static void addNodeAtStart(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			head.next=head;
			tail=newNode;
		}else {
			newNode.next=head;
			tail.next=newNode;
			head=newNode;
		}
	}
	
	public static void addNodeAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			tail.next=head;
		}else {
			newNode.next=tail.next;
			tail.next=newNode;
			tail=tail.next;
		}
	}
	
	public static void display() {
		Node currNode = head;

		do {
		    System.out.print(currNode.data + " --> ");
		    currNode = currNode.next;
		} while (currNode != head);

		System.out.println("(back to head)");
	}
	
}
