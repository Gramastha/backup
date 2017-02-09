package esg.itp.shape;

public interface Polygon {
	void calcArea( );	
	void calcPeri( ); 	
	default void display( ){
		calcArea();
		calcPeri();
	}

}
