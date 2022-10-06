package linkedList;



public class FindElemenetLL {
		
	public static int findNode(Node<Integer> head ,int key) {
	
		if(head==null)return -1;
		int i=0;
		while(head!=null) {
			if(head.data==key) {
				return i;
			}
			head=head.next;
			i++;
		}
		return -1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=InputLL.takeInput();
		
		System.out.println(findNode(head,4));
	}

}
