import java.util.List;

public class PancakeHouseIterator implements Iterator {

	List<MenuItem> items;
	int position = 0;

	public PancakeHouseIterator(List<MenuItem> items) {
		this.items = items;
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		if(position >= items.size() || items.get(position) == null) {
			return false;
		}else {
			return true;
		}
	}
}
