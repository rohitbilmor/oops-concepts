package com.oops;
//import java.util.Scanner;
class Rectangle2
{
	public int length;
	public int breadth;
	
	public Rectangle2()
	{
		//Scanner sc=new Scanner(System.in);
		
		length=4;//sc.nextInt();
		breadth=6;//sc.nextInt();
	}
	public Rectangle2(int l,int b)
	{
		length=l;
		breadth=b;
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
public class Constructor_public_properties {

	public static void main(String[] args) {
		Rectangle2 r=new Rectangle2();
		System.out.println(r.area());
		System.out.println(r.perimeter());

	}

}
