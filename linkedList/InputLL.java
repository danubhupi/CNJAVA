package linkedList;

import java.util.Scanner;

public class InputLL {
	
	public static Node<Integer> takeInput(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		if(data==-1)return null;
		Node<Integer> head= new Node<Integer>(data);
		Node<Integer> temp=head;
		data=sc.nextInt();
		while(data!=-1) {
			
			Node<Integer> newNode=new Node<Integer>(data);
			temp.next=newNode;
			temp=temp.next;
			data=sc.nextInt();
		}
		
		
		return head;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
//		using static method in a static manner
		PrintLL.printLL(head);;

	}

}
