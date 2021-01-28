package com.oops;
class Student 
{
	public String name;
	public String course;
	public long rollNo;
	public int m1,m2,m3;
	public int total()
	{
		return m1+m2+m3;
	}
	public long roll()
	{
		return rollNo;
	}
	public int average()
	{
		return (m1+m2+m3)/3;
	}
	public char grade()
	{
		
		if(average()>70)
			return 'A';
		else if(average()>50&& average()<70)
			return 'B';
		else if(average()>40 && average()<50)
			return 'E';
		else
			return 'F';
	}
	public String toString()
	{
		return name+"\n"+rollNo+"\n"+course+"\n";
	}
	
}

public class Student_details {

	public static void main(String[] args) {
		Student sc=new Student();
		sc.name="robot";
		sc.rollNo=24511633152l;
		sc.course="CS";
		sc.m1=41;
		sc.m2=34;
		sc.m3=45;
		
		System.out.println(sc.average());
		System.out.println(sc.grade());
		System.out.println(sc);
		
		
	}

}
