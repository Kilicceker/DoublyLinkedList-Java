package linkedlist;

import generic.List;



public class DoublyLinkedList<Type> implements List<Type>{
	
	
	protected Node<Type> head;
	protected Node<Type>tail;
	
	 public DoublyLinkedList() {
	        head=new Node<Type>(null, null, null);
	        tail=head;
	        
	    }
	
      
	@Override
	public void add(Type t) {              //Add data to list            
		
		Node<Type> new_node=new Node<Type>(t, null, tail);
        tail.next=new_node;
        tail=new_node;}        	  

	@Override
	public int add(int index, Type t) {               //Add data to the index       
		Node<Type> new_node=new Node<Type>(t, null, tail);
        if(index==0){                              //If index is 0
	    tail.next=new_node;
        tail=new_node;
        }
        else {  Node<Type> pointer1= null;             //If index is bigger than 1 
                Node<Type> pointer2= head;
                int count=0;
		while(pointer2!=null && count<index) {
			
			pointer1=pointer2;
			pointer2=pointer2.next;
			count++;
		}
		if(pointer2==null) {
			tail.next=new_node;                    //If index is last 
			tail=new_node;
		}
		else { new_node.next=pointer2;	
		       pointer1.next=new_node;
		}
		}
		return index;
		
	}        		
	@Override
	public void addAll(List<Type> list) {        //2 List merge
		
		DoublyLinkedList<Type> new_list=(DoublyLinkedList<Type>)  list;
		
		
		tail.next=new_list.head.next;
		new_list.head.next.previous=tail;
		tail=new_list.tail;
		
	     
		
	}

	@Override
	public int addAll(int index, List<Type> list) {        
		Node<Type> new_node=head;
		DoublyLinkedList<Type> new_list=(DoublyLinkedList<Type>)  list;
		
		
		for(int i=1;i<=index;i++) {         //when index==input index break for.  Get input index list1
			
			new_node=new_node.next;
		}
		
		new_node.previous.next=new_list.head.next;      //New list first index and input index merge 
		new_list.head.previous=new_node.previous;            
		new_list.tail.next=new_node;                        
		new_node.previous=new_list.tail; 
		return index;
	}

	@Override
	public Type get(int index) {        //Get data in the list
		
		
		Node<Type> new_node;
		new_node=head;
		for (int i = 1; i <= index; i++) {   //when index==input index break for.  Get last index
			
			new_node=new_node.next;
			
			}
		return new_node.data;
		
	}
		
	

	@Override
	public void clear() {         //If First index==null so others will be null.So list will be clear. 
		head.next=null;
		
	}

	@Override
	public Type remove(int index) {        
		
		
		if(head==tail) {             
 			head=null;                //List has a data
			tail=null;                //delete head and tail
			
		} 
		else {                  //List has 2 or more data
			if(index==0) {                       
				
			Node<Type> newHead= head.next;         //First index will be head,so will be remove first index
			head=newHead;
			}
			else {
				Node<Type> pointer1;
				Node<Type> pointer2;
				pointer1= null;
				pointer2= head;
				int count=0;
				while(pointer2!=null && count<index) {   //when index==input index break while && Pointer is null break while
					pointer1=pointer2;
					pointer2=pointer2.next; 
				count++;
			}
			    if(pointer2 !=null) {            //If List don't have input index   
				    if(pointer2==tail)  {            
					    tail=pointer1;
					    pointer1.next=null;
				    }
				    else {                  //Delete last index       
				    	Node<Type> pointer3;	 
				    	pointer3=pointer2.next;
				    	pointer2.next=null;
				    	pointer1.next=pointer3;
				
					
				
				    }
			    }}}
		return null;
		
	
		
	}

	@Override
	public int size()  {
	       Node<Type> new_node=head;
		   int size=0;
	        while (new_node.next != null) {   //when last index == null while will break && every turn size++
	        	new_node = new_node.next;
	            size++;

	        }

	        return size;
	    }
           
		

	@Override
	public boolean contains(Type t) {                
		
		Node<Type> new_node=head;
		for (int i = 1; i <= size(); i++) {   //when data==input data ,for will be break and return True.Else return False  
			new_node = new_node.next;
			if(t==new_node.data) {
				
				return true;
			}			
			
			}
		return false;
				
		}		
	@Override
	public boolean isEmpty() {
		
		return head.next==null;	 //If first index is empty,List is empty
		}
	
	public String toString() {
		String s = "-->";
		
		Node<Type> new_node = head.next;
		while(new_node!=null) {
			s = s + new_node.data.toString() + "-->";
			new_node = new_node.next;
		}
		
		return s;
	}
	public void print(){
		
	System.out.println(toString());
	
	}
	
	
}
