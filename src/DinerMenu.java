
public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;

	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegeterian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 3.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 5.99);
		addItem("Hotfog", "A hot dog, with sourkraut, relish, onions, topped with cheese", true, 5.99);
	}

	public void addItem(String name, String description, boolean vegeterian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}

	}
	
	/*
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	*/
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
