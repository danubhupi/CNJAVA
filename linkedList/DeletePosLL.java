package linkedList;



public class DeletePosLL {
	
	public static Node<Integer> deleteElement(Node<Integer> head,int pos) {
		if(pos==0) {
			head=head.next;
			return head;
		}
		Node<Integer> temp=head;
		int index=0;
		while(index<pos-1) {
			temp=temp.next;
			index++;
		}
		temp.next=temp.next.next;
		
		return head;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node <Integer> head=  InputLL.takeInput();
		
		head=deleteElement(head,1);
		
		 PrintLL.printLL(head);

	}

}
