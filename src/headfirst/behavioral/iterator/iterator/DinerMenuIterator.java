package headfirst.behavioral.iterator.iterator;

import headfirst.behavioral.iterator.menu.MenuItem;

public class DinerMenuIterator implements Iterator {
	
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public Object next() {
		return items[position++];
	}
	
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

}
