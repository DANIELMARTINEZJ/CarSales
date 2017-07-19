
public class Earth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Empiezo a ejecutar la poblacion");
		Human tom = new Human("tom", 10, 65, "brown");
		tom.salute();
		
		Fish tiburon = new Fish("M", 2, 2);
		tiburon.sleep();
		tiburon.swimg();
	
		Canario beto = new Canario("M", 1, 1);
		beto.fly();
		
		Chicken rodrigo = new Chicken("F", 2, 1);
		rodrigo.eat();
		
	}
	
}
