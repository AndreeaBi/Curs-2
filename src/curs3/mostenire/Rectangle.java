package curs3.mostenire;

public class Rectangle {
	
	private int length;
	private int width;
	
	//constructor--optional pentru noi, pentru ca Java il seteaza automat daca nu il punem noi
	public Rectangle() {
		
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int calcualteArea() {
		return length*width;
		
	}

}
