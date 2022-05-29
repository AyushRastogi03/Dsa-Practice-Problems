package Liv;

import java.util.Scanner;

class Node {
	int data ;
	Node next ;
	
	
	public Node(int data) {
		this.data= data ;
		this.next = null ;
	}
}



public class LinkedListInsertion {

	public Node head = null ;
	public Node tail = null ;
	
	public void addAtStart(int data ) {
		Node newNode = new Node(data);
		
		if(head == null ) {
			head = newNode ;
			tail = newNode ;
			
		}
		else {
//			Node temp = head ;
//			head = newNode ;
//			head.next = temp ;
			
			newNode.next = head ;
			head = newNode ;
		}
		
	}
	
	public void addAtLast(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode ;
			tail = newNode ;
		}
		else {	
			tail.next = newNode ;
			tail = newNode ;	
		}
	}
	
	public void addAtPosition(int data , int position) {
		 Node newNode = new Node(data);
		 
		
		
		if(position == 1) {
			newNode.next = head ;
			head = newNode ;
		}
		Node current = head ;
		
		int i=0;
		while(i<position-2) {
			
				current = current.next ;
			   
				
				if(current==null)
					System.out.println("Position Out of Range");
				
		i++ ;
		}
		
		
		newNode.next = current.next ;
		current.next = newNode ;
		
		
	}
	
	
	public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner sc = new Scanner(System.in);
		
		LinkedListInsertion  sList = new LinkedListInsertion();  
		  
	        //Adding 1 to the list  
	        sList.addAtStart(1);  
	        sList.display();  
	  
	        //Adding 2 to the list  
	        sList.addAtStart(2);  
	        sList.display();  
	  
	        //Adding 3 to the list  
	        sList.addAtStart(3);  
	        sList.display();  
	  
	        //Adding 4 to the list  
	        sList.addAtStart(4);  
	        sList.display();  
		
	        sList.addAtLast(5);
	        sList.display();
	        
	        
	        sList.addAtPosition(6,2);
	        sList.display();
	        
	        sList.addAtPosition(9,9);
	        sList.display();


	}

}
