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
	
	public boolean equals( Coordinate c){
		Boolean a = null;
		if(c==this) {
			a= true;
		}
		if(c == null) {
			a= false;
		}
		if(!(c instanceof Coordinate)) {
			a= false;
		}
		if(x==c.x && y==c.y) {
			a= true;
		}
		return a;
	}
	
	public  String toString() {
		StringBuilder concatenation=new StringBuilder();
		concatenation.append( "["+ x + "," + y + "]");
		return concatenation.toString();
	}
	
	public Coordinate add( Coordinate c) {
		Coordinate new_c= new Coordinate(x+c.x,y+c.y);
		return new_c;
		
	}
	public Coordinate add(int x,int y) {
		Coordinate new_c= new Coordinate(this.x+x,this.y+y);
		return new_c;
	}

}
