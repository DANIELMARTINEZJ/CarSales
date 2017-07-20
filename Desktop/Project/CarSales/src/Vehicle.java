
public abstract class Vehicle {
	
		String marca;
		String modelo;
		int year;

		public Vehicle(String marca, String modelo, int year) {

			this.marca = marca;
			this.modelo = modelo;
			this.year = year;
		}
		
		public void getOn() {

			System.out.println("vehicle get on...");
		}

		public void move() {

			System.out.println("moving...");
		}
		
		public abstract void datos();
}
