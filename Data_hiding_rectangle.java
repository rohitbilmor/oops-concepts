package com.oops;

class Rectangle1
{
	private int length;
	private int breadth;
	public int getLength()
	{
		return length;
	}
	public int getBreadth()
	{
		return breadth;
	}
	public void setLength(int l)
	{
		length=l;
	}
	public void setBreadth(int b)
	{
		breadth=b;
	}
	public int area()
	{
		return getLength()*getBreadth();
	}
	public int perimeter()
	{
		return 2*(length+breadth);
	}
}
public class Data_hiding_rectangle {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1();
		r.setLength(112);
		r.setBreadth(14);
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		System.out.println(r.area());
		System.out.println(r.perimeter());
		

	}

}
