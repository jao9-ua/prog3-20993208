package model;

public class Coordinate {
	private int x;
	private int y;
	
	public Coordinate(int x, int y) {
		this.y=y;
		this.x=x;
	}
	public Coordinate( Coordinate c ) {
		x=c.x;
		y=c.y;
		
	}
	
	public int getX() {
		return x;
		}
	
	public int getY() {
		return y;
		}
	
	public boolean equals( Coordinate coordinate){
		Boolean a = null;
		if(coordinate==this) {
			a= true;
		}
		if(coordinate == null) {
			a= false;
		}
		if(!(coordinate instanceof Coordinate)) {
			a= false;
		}
		if(x==coordinate.x && y==coordinate.y) {
			a= true;
		}
		return a;
	}
	
	public  String toString() {
		StringBuilder concatenation=new StringBuilder();
		concatenation.append( "["+ x + "," + y + "]");
		return concatenation.toString();
	}
	
	public Coordinate add( Coordinate coordinate) {
		Coordinate new_c= new Coordinate(x+coordinate.x,y+coordinate.y);
		return new_c;
		
	}
	public Coordinate add(int x,int y) {
		Coordinate new_c= new Coordinate(this.x+x,this.y+y);
		return new_c;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}