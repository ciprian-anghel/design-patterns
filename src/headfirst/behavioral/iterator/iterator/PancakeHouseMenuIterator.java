package headfirst.behavioral.iterator.iterator;

import java.util.ArrayList;

import headfirst.behavioral.iterator.menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {

	private ArrayList<MenuItem> items;
	private int position;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		this.items = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return items.get(position++);
	}

}
