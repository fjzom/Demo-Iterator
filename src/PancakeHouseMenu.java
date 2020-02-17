import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", true, 3.99);
		addItem("BlueBerry Pancake Breakfast", "Pancakes with fresh blueberries", true, 5.99);
		addItem("Waffles", "Waffles with  blueberries or strawberries", true, 5.99);
	}

	public void addItem(String name, String description, boolean vegeterian, double price) {
		MenuItem menuItem =  new MenuItem(name, description, vegeterian, price);
		menuItems.add(menuItem);
	}
	
	/*
	 * public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}*/
	
	public Iterator createIterator() {
		return new PancakeHouseIterator(menuItems);
	}
	
	
}
