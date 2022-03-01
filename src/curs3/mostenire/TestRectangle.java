package curs3.mostenire;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle();
		obj.setLength(2);
		obj.setWidth(5);
		
		obj.length = 6;
		
		System.out.println(obj.calcualteArea());

	}

}
