
public class Automovil extends Vehicle{

	int doors;
	public Automovil(String marca, String modelo, int year, int doors) {
		super(marca, modelo, year);
		this.doors = doors;
		// TODO Auto-generated constructor stub
		
	}
	
	public void datos() {
		
		System.out.println("marca: "+marca+" modelo: "+modelo+" year: "+year+" doors: "+doors);
	}
}