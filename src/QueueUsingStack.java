import java.util.Iterator;
import java.util.Stack;

public class QueueUsingStack {

	Stack<Object> mainStack = new Stack<>();
	Stack<Object> tempStack = new Stack<>();

	public void add(Object obj) {
		if (mainStack.isEmpty()) {
			mainStack.push(obj);
		}else{
			Iterator<Object> itr = mainStack.iterator();
			while(itr.hasNext()){
				Object temp = itr.next();
				tempStack.push(temp);
			}
			
			
		}

	}

}
