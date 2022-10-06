package linkedList;

public class RemoveDuplicates {
	
	public static Node<Integer> removeDuplicates(Node<Integer> head){
		if(head==null)return null;
		Node<Integer> prev=head;
		Node<Integer> current=head;
		int prevData=prev.data;
		
//		while(current!=null) {
//			if(prevData==current.data) {
//				current=current.next;
//			}
//			else {
//				
//				prev.next=current;
//				prev=current;
//				prevData=prev.data;
//				current=current.next;
//			}
//		}
//		prev.next=current;
		while(current.next!=null) {
			if(current.data.equals(current.next.data)) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=InputLL.takeInput();
		head=removeDuplicates(head);
		PrintLL.printLL(head);

	}

}
