package model;

public class Coordinate {
	private int x,y;
	public{
		Coordinate(int x, int y);
		Coordinate(final Coordinate&);
		int getX() final { return x; }
		int getY() final { return y; }
		bool operator equals(final Coordinate&) final;
		string to_string() final;
		Coordinate add(final Coordinate& c) final;
		Coordinate add(int x,int y) final;
	}
}
