
public class Human {
	
	String name;
	int age;
	int height;
	String eyeColor;

	public Human(String name, int age, int height, String eyeColor) {
	
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
	}
	public void eat() {
		System.out.println("eating...");
	}

	public void walk() {
		System.out.println("walking...");
	}
	public void salute() {
		System.out.println("Hello my name is " + this.name);
	}
}
