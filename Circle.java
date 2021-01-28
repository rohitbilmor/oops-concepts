package com.oops;

class Circle1
{
    public double radius;
    public double area()
    { 
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
public class Circle {
     public static void main(String[] args) {
         Circle1 c1=new Circle1();
         c1.radius=9;
         System.out.println("Area:"+c1.area());
         System.out.println("Perimeter:"+c1.perimeter());
         System.out.println("Circumference:"+c1.circumference());
        }
        
    }
    


