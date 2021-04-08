

import linkedlist.DoublyLinkedList;

public class Test {

	public static void main(String[] args) {

		
		
		DoublyLinkedList<Integer> list= new DoublyLinkedList<Integer>();
		DoublyLinkedList<Integer> list1 = new DoublyLinkedList<Integer>();
		DoublyLinkedList<Integer> list2 = new DoublyLinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("List  : ");
		list.print();
		System.out.println("------------------ ");
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list.addAll(list1);
		System.out.println("List+List1    :");
		list.print();
		System.out.println("------------------ ");
		
		
		
		
		list2.add(99);
		list2.add(999);
		list2.add(9999);
		list.addAll(2, list2);
		System.out.println("List 2. İndex add List2    :");
		list.print();
		System.out.println("------------------ ");
		
		
		
		
		System.out.println("List size     :"   );
		System.out.println(list.size());
		System.out.println("------------------ ");
		
		
		
		
		System.out.println("List in 4 index add 100     :"   );
		list.add(4, 100);		
		list.print();
		System.out.println("------------------ ");
		
		
		System.out.println("List remove 2 index    :"   );
		list.remove(2);
		list.print();
		System.out.println("------------------ ");
		
		
		System.out.println("List has 10?"   );
		System.out.println(list.contains(10));
		System.out.println("List has 375?"   );
		System.out.println(list.contains(375));
		System.out.println("------------------ ");
		
		
		System.out.println("List in 2. index    : "   );
		System.out.println(list.get(2));
		System.out.println("------------------ ");
		
		
		
		System.out.println("Clear List    : "   );
		list.clear();
				list.print();
	}

}