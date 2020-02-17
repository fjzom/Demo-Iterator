
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu mexicanMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu mexicanMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.mexicanMenu = mexicanMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator mexicaniterator = mexicanMenu.createIterator();
		
		System.out.println("Menu\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("Menu\n----\nLUNCH");
		printMenu(dinerIterator);
		System.out.println("Menu\n----\nMEXICAN FOOD");
		printMenu(mexicaniterator);
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
