import java.util.Arrays;

public class ArrayListImplementation {

	Object[] store;
	int size = 0;

	public ArrayListImplementation() {
		store = new Object[10];
	}

	public ArrayListImplementation(int size) {
		store = new Object[size];
	}

	public void add(Object a) {
		if (store.length - size <= 0) {
			increaseArraySize();
		}
		store[size++] = a;
	}

	public Object get(int index) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException("No available index");
		} else {
			return store[index];
		}
	}

	public Object remove(int index) {
		if (size <= index)
			throw new ArrayIndexOutOfBoundsException();
		Object obj = store[index];
		store[index] = null;
		int temp = index;
		while (temp < size) {
			store[temp] = store[++temp];
			store[temp] = null;
		}
		size--;
		return obj;
	}

	private void increaseArraySize() {
		int len = store.length;
		store = Arrays.copyOf(store, (store.length) * 3 / 2);
		System.out.println("Size increased from " + len + " to " + store.length);
	}

	public static void main(String[] args) {
		ArrayListImplementation arr = new ArrayListImplementation();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println(arr.remove(1));
		System.out.println(arr.get(1));
		

	}

}
