
public class Animal {
	
	String gender;
	int weight;
	int age;

	public Animal(String gender, int weight, int age) {

		this.gender = gender;
		this.weight = weight;
		this.age = age;
	}

	public void eat() {
		System.out.println("eating...");
	}

	public void sleep() {
		System.out.println("sleeping...");
	}
	
}