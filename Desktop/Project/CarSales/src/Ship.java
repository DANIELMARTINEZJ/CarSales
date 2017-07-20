
public class Ship extends Vehicle{

	public Ship(String marca, String modelo, int year) {
		super(marca, modelo, year);
		// TODO Auto-generated constructor stub
	
	}
	
	public void datos() {
		
		System.out.print("marca: "+marca+" modelo: "+modelo+" year: "+year);
	}
	public String row() {
		
		return " Able to move with 4 rows...";
	}
	
}
