package org.tnsif.queueodemo;

	import java.util.ArrayDeque;
	import java.util.Deque;

	public class ArrayDequeueDemo {

		public static void main(String[] args) {
			Deque<String> obj=new ArrayDeque<>();
			obj.add("Dhanashri");
			obj.addFirst("Neha");
			obj.offerFirst("Shrushti");
			obj.addLast("Gaurav");
			System.out.println("Array Deque elemntns are: ");
			for(String s: obj)
			{
				System.out.print(s+" ");
			}
			obj.removeFirst();
			System.out.println("\n\nRemove first: "+obj);
			obj.removeLast();
			System.out.println("Remove last: "+obj);
			obj.remove();
			System.out.println("Array Deque elemntns are: "+obj);




		}

	}


