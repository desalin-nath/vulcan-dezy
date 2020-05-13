package javaprogram;

public class Java {
	//public void add(int a,int b)
	{
	
	int a=20;
	int b=30;
	int c=a+b;
	int x=10;
	int y=2;
	int z=x/y;
	int p=10;
	int q=5;
	int r=p-q;
	
	
	System.out.println("the total is "+c);
	}
	/**
	 * testVulcan
	 * */
	 
public void multiply(int a,int b)
{
	int c= a*b;
	System.out.println("multiple of "+c);
	
	}
public void div(int x,int y)
{
	int z=x/y;
	System.out.println("division of "+z);
	
}
public void sub(int p,int q)
{
	int r=p-q;
	System.out.println("substaction of "+r);
	
}

public static void main(String[] args) {
		
		Java j=new Java();
		//j.add(10,6);
		j.multiply(10,4);
		j.div(20, 10);
		j.sub(20, 5);
		

	}

}
