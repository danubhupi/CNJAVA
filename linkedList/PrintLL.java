package linkedList;

public class PrintLL {
	
	public static void printLL(Node<Integer> head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
		return;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
