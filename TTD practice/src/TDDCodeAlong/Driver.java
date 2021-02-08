package TDDCodeAlong;

public class Driver {
	private String color;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Driver(String color,int age) {
		this.color = color;
		this.age = age;
	}
	public String toString() {
		return "Ducks{color='"+color+"','age='"+age+"'}";
	}
}
