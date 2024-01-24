package test;

public abstract  class Shape {
	private String color = "black";
	private String color2;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void draw();
	
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}
}
