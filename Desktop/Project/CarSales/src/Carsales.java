
public class Carsales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automovil car1 = new Automovil("Audi", "A4", 2010, 5);
		Automovil car2 = new Automovil("Meche", "AMG", 2012, 3);
		Automovil car3 = new Automovil("Toyotita", "Yaris", 1995, 5);
		car1.datos();
		car2.datos();
		car3.datos();
		Motorcycle car4 = new Motorcycle("Honda", "Spider", 2014, 140);
		car4.datos();
		Ship car5 = new Ship("Pacific", "Isabelita", 2010);
		car5.datos();
		System.out.println(car5.row());
	}

}
