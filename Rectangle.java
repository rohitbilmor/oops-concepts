package com.oops;
class Rectangle
{
	public int length;
	public int breadth;
	public int area()
	{
		return length*breadth;
	}
	public int perimeter()
	{
		return 2*(length+breadth);
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.length=5;
		r.breadth=6;
		System.out.println("area:"+r.area());
		System.out.println("perimeter:"+r.perimeter());

	}

}
