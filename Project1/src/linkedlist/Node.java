package linkedlist;



public class Node<Type> {
	protected Type data;
	protected Node<Type> next;
	protected Node<Type> previous;
	
	public Node(Type data, Node<Type> next,Node<Type> previous) {
		this.data = data;
		this.next = next;
		this.previous=previous;
	}
	
	public Type getData() {
		return data;
	}
	
	public Node<Type> getNext() {
		return next;
	}
}