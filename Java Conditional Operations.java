/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		boolean x=true;
		boolean y=true;
		boolean z=false;
		System.out.println(x&&y);     //AND(&&) Operator
		System.out.println(x&&z);     
		System.out.println(x||y);    // OR(||) Operator
		System.out.println(x||z);
		System.out.println(x&&y?"True":"False"); //Ternary Operator
		
		int p=10;
		int q=10;
		int r=15;
		System.out.println(p==q&&q==10);
		System.out.println(q==r&&p==r);
		System.out.println(p==r||r==10);
		System.out.println(p==r||p==q);
		System.out.println(p==10?"Yes":"No");
		
		if(p==q&&r==15)
		    System.out.println("returns True");
		else
		    System.out.println("return False");
		    
		String x1="Hello";   //String litral
		String y1="hello";   //String litral
		String z1=new String("hello"); //String Object
		if(x1=="Hello")
		    System.out.println("x1 is equal to Hello");
		else
		    System.out.println("x1 is not equal to Hello");
		//*************************************************************
		if(x1==y1)
		    System.out.println("x1 is equal to y1");
		else
		    System.out.println("x1 is not equal to y1");
		//*************************************************************
		if(y1==z1)
		    System.out.println("y1 is equal to z1");
		else
		    System.out.println("y1 is not equal to z1");
	  //******************************************************************
	  if(y1.equals(z1))
	    System.out.println("y1 is equal to z1");
	  else
	    System.out.println("y1 is not equal to z1");
	  //practice Question to check two Numbers are equals or not 
	  int x2=17;
	  int y2=17;
	  if(x2==y2)
	    System.out.println("x2 is equal to y2");
	  else
	    System.out.println("x2 is not equal to y2");
	    
	  System.out .println(x2==y2?"x2 is equal to y2":"x2 is not equal to y2");  //using Ternary Operator
	}
}

