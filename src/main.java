

public class main {
	public static void main(String[] args) {
		PancakeHouseMenu p = new PancakeHouseMenu();
		DinerMenu d = new DinerMenu();
		MexicanFoodStyleMenu m = new MexicanFoodStyleMenu();
		Waitress w = new Waitress(p, d, m);
		w.printMenu();
	}
}
