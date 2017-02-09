package esg.itp.shape;

public class Rectangle implements Polygon{

	float length,breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		System.out.println("Area: "+length*breadth);
		
	}

	@Override
	public void calcPeri() {
		System.out.println("Perimeter: "+2*(length+breadth));
		
	}

}
