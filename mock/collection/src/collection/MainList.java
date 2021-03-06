package collection;

import java.util.Iterator;

public class MainList {

	Object[] array;
	int position;

	public void MainList(int size) {
		array = new Object[size];
	}

	public void add(Object obj) {
		if (position >= array.length) {
			increaseCapacity();
		}
		array[position] = obj;
		position++;
	}

	private void increaseCapacity() {
		Object[] temp = new Object[(array.length * 3) / 2];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public Object get(int index) {
		return array[index];
	}

	public void remove(int index) {
		for (int i = index; i <= position; i++) {
			position--;
		}
	}

	public Iterator iterator() {
		return new MyItr();
	}

}

class MyItr implements Iterator {

	int index;

	@Override
	public boolean hasNext() {

		return (index < position) ? true : false;
	}

	@Override
	public Object next() {

		return null;
	}
	
}