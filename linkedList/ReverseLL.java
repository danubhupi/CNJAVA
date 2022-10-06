package linkedList;

public class ReverseLL {
	
	public static Node<Integer> reverseLL(Node<Integer> current,Node<Integer> tail ){
		if(current.next==null) {
			tail.next=current;
			return current;
		}
		Node<Integer> temp=reverseLL(current.next,tail);
		temp.next=current;
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> tail=new Node(-1);
		Node<Integer> head=InputLL.takeInput();
		head=reverseLL(head,tail);
		head.next=null;
		tail=tail.next;
		PrintLL.printLL(tail);

	}

}
