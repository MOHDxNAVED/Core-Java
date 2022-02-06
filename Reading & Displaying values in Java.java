/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		char gender=sc.next().charAt(0);
		float marks1=sc.nextFloat();
		float marks2=sc.nextFloat();
		float marks3=sc.nextFloat();
		double result=marks1+marks2+marks3;
		float result1=marks1+marks2+marks3;
		boolean active=sc.nextBoolean();
		
		//Display all values in diifrent line using "\n"
		System.out.println(id+"\n"+name+"\n"+gender+"\n"+result+"\n"+result1+"\n"+active);
		
		//Display all valuein sinle line using space and using tab space using "\t"
		System.out.println(id+" "+name+" "+gender+" "+result+" "+result1+" "+active);
		System.out.println(id+"\t"+name+"\t"+gender+"\t"+result+"\t"+result1+"\t"+active);
		
		//Display decimal values after specific digit
		String s1=String.format("%.4f",result);
		System.out.println("Display 4 decimal point:"+s1);
		System.out.println("Display 2 Decimal point"+String.format("%.2f",result));
		
		//Round off
		double x=89.976;
		DecimalFormat dc=new DecimalFormat("#.#");
		System.out.println("Round off:"+dc.format(x));
		DecimalFormat dc1=new DecimalFormat("#.##");
		System.out.println("Round off:"+dc1.format(x));
		
		//Type Conversion
		int xy=10;              //Automatic Casting
		double y=xy;
		System.out.println(xy);
		System.out.println(y);
		 
		double z=45.56;
		int a=(int)z;
		System.out.println(z);  //Manual Casting
		System.out.println(a);
		
		double b=9/2;    // one operand would be float for integer division
		System.out.println(b);
		double b1=9.0/2;
		System.out.println(b1);
		double b2=(double)9/2;
		System.out.println(b2);
		
	}
}
