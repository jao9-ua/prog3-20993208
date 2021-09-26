package model;

public class Coordinate {
	private int x,y;
	public Coordinate(int x, int y) {}
	public Coordinate( Coordinate coordinate );
	public int getX() {
		return x;
		}
	public int getY() {
		return y;
		}
	public bool operator.equals( Coordinate coordinate);
	public  String toString();
	public Coordinate add( Coordinate c) {
		return null;
	}
	public Coordinate add(int x,int y) ;

}
