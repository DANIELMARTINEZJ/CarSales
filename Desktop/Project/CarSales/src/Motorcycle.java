
public class Motorcycle extends Vehicle {
	
	int torque;
	public Motorcycle(String marca, String modelo, int year, int torque) {
		super(marca, modelo, year);
		this.torque = torque;
		// TODO Auto-generated constructor stub
	}
	
	public void datos() {
		
		System.out.println("marca: "+marca+" modelo: "+modelo+" year: "+year+" torque: "+torque);
	}
}
