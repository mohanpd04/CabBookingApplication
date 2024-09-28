package com.example.model;

public class Location {
	
	private int x;
	private int y;
	public Location(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Location [x=" + x + ", y=" + y + "]";
	}
	
	

}
