import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Collections {

	public static void main(String[] args) {

		HashSet<String> hs2 = new HashSet<>();
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("Vikram");
		hs.add("chhh");
		hs.add("ajeram");
		hs.add("ram");
		hs.add("am");

		Iterator<String> itr = hs.iterator();
//		while (itr.hasNext())
//			System.out.println(itr.next());
		
		Queue<String> queue = new PriorityQueue<>();
		
		
		Map<String, String> gg;
//------------------------------------------------------		
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		
		
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		stack1.push(6);
	
		
		
		stack2.addAll(stack1);
		
		System.out.println(stack2.peek());

	}

}
