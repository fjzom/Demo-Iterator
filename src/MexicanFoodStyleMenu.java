import java.util.Vector; 
public class MexicanFoodStyleMenu implements Menu {
	Vector<MenuItem> menuItems;
	
	public MexicanFoodStyleMenu() {
		menuItems = new Vector<MenuItem>();
		addItem("Tacos", "Tacos de carne con soda", true, 3.99 );
		addItem("Tacos", "Tacos de carne sin soda", true, 2.99 );
		addItem("Qusadillas", "Tacos con queso", true, 3.99 );
	}
	
	private void addItem(String name, String description, boolean vegeterian, double price) {
		 MenuItem item = new MenuItem(name, description, vegeterian, price);
		 menuItems.add(item);
	} 
	 
	
	public Iterator  createIterator() {
		// TODO Auto-generated method stub
		return  new MexicanFoodStyleMenuIterator(menuItems);
	}
}
