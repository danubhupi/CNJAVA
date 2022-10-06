package linkedList;

public class AppendLastNtoFirst {
	
	public static Node<Integer> findTail(Node<Integer> head){
//		System.out.println("find tail");
		while(head.next!=null) {
			head=head.next;
		}
		return head;
	}
	
	public static int lengthLL(Node<Integer> head) {
//		System.out.println("find length");
		
		int length=0;
		while(head!=null) {
			length++;
			head=head.next;
		}
//		System.out.println("length: "+ length);
		return length;
	}
	
	public static Node<Integer> lastNtoFirst(Node<Integer> head,int k){
		 
//		System.out.println("appen last");
		
		Node<Integer> tail=findTail(head);
		int length=lengthLL(head);
		
		
		Node<Integer> temp=head;
		int i=0;
		
		while(i<length-k-1) {
			temp=temp.next;
//			System.out.println(i);
			i++;
		}
		tail.next=head;
		head=temp.next;
		temp.next=null;
		
		
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=InputLL.takeInput();
//		PrintLL.printLL(head);
		head=lastNtoFirst(head,4);
		PrintLL.printLL(head);
		}

}
