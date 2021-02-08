package TDDCodeAlong;

public class Ducks {
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
	public Ducks(String color,int age) {
		this.color = color;
		this.age = age;
	}
	public Ducks() {
		age = 0;
		color = "";
	}
	public String toString() {
		return "Ducks{color='"+color+"','age='"+age+"'}";
	}
}
