package curs3.mostenire;

public class Rectangle {
	
	public int length;
	public int width;
	
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
