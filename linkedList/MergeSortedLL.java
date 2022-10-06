package linkedList;

public class MergeSortedLL {
	
	public static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2){
		//head of resultanat LL
		Node<Integer> head= head1.data<head2.data?head1:head2;
		// Tail of resultant linkedList 
		/// using tail to add the new elements to result
		// linked list
		Node<Integer> tail= head1.data<head2.data?head1:head2;
		// moving ahead as tail has alreay at this place
		// if we dont move ahead then we'll be stuck in a loop
		
		if(head1.data<head2.data) {
			head1=head1.next;
		}
		else {
			head2=head2.next;
		}
		// Merging till one LL ends
		while(head1!=null &&  head2!=null) {

			//Smaller node is connected with the tail 
			// head with smaller value moved to next pos
			if(head1.data<head2.data) {
				tail.next=head1;
				head1=head1.next;
				tail=tail.next;
				
			}
			else {
				tail.next=head2;
				head2=head2.next;
				tail=tail.next;
			}
		}
		// LL which has not ended is connected to tail in the end
		tail.next=head1!=null?head1:head2;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1=InputLL.takeInput();
		Node<Integer> head2=InputLL.takeInput();
		
		Node<Integer>head=mergeSortedLL(head1,head2);
		
		PrintLL.printLL(head);

	}

}
