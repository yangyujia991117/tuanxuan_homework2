import java.util.Scanner;
public class CompareNumbers{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
	System.out.println("input 3 numbers:");
	System.out.println("enter the first number:");
	long A=scan.nextLong();
	System.out.println("enter the second number:");
	long B=scan.nextLong();
	System.out.println("enter the third number:");
	long C=scan.nextLong();
	if(A==B&&B==C)
	System.out.println("There are same numbers.");
      else{
	    if(A>=B&&A>=C)
	    System.out.println("The largest number is"+A);
	    if(B>=A&&B>=C)
	    System.out.println("The largest number is"+B);
	    if(C>=A&&C>=B)
	    System.out.println("The largest number is"+C);
	  }
	
	}
}
	