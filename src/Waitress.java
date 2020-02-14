
public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	MexicanFoodStyleMenu mexicanMenu;
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, MexicanFoodStyleMenu mexicanMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.mexicanMenu = mexicanMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dienrIterator = dinerMenu.createIterator();

		System.out.println("Menu\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("Menu\n----\nLUNCH");
		printMenu(dienrIterator);
		System.out.println("Menu\n----\nMEXICAN FOOD");
		printMenu(mexicanMenu.createIterator());
	}
	
	private void printMenu(java.util.Iterator<MenuItem> iterator) {
		
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
		
		private void printMenu(Iterator iterator) {
			
			while(iterator.hasNext()) {
				MenuItem menuItem = (MenuItem) iterator.next();
				System.out.println(menuItem.getName() + ", ");
				System.out.println(menuItem.getPrice() + " -- ");
				System.out.println(menuItem.getDescription());
			}
	}
}
