package esg.itp.shape;

public class Square implements Polygon {
	
	
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		System.out.println("Area: "+side*side);
		
	}

	@Override
	public void calcPeri() {
		
		System.out.println("Perimeter: "+4*side);
	}

}
