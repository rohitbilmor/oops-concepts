package com.oops;
class Rectangle3
{
	private int length;
	private int breadth;
	
	public Rectangle3()
	{
		length=4;
		breadth=6;
	}
	public Rectangle3(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public int getLength(int l)
	{
		return length;
	}
	public int getBreadth(int b)
	{
		return breadth;
	}
	public int setLength(int l)
	{
		if(length>=0)
			return length=l;
		else return length=0;
	}
	public int setBreadth(int b)
	{
		if(breadth>=0)
		return	breadth=b;
		else return breadth=0;
	}
	public int area()
	{
		return length*breadth;
	}
	public int perimeter()
	{
		return 2*(length+breadth);
	}
}
public class Constructo_private_properties {

	public static void main(String[] args) {
		Rectangle3 r=new Rectangle3();
		System.out.println(r.area());
		System.out.println(r.perimeter());

	}

}
