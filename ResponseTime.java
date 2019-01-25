import java.util.Scanner;

public class ResponseTime{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
	int[] b;
	b = new int[50] ;                                     
	int i=0;
	double average=0;
	double sd=0;
	String a = new String("");
	
	System.out.println("Enter a number:");
	a=scan.next();                         

   while(!(a.equals("done"))){
	b[i]=Integer.valueOf(a); 
	System.out.println("Enter a number:");
	a=scan.next();                                  
	                       
	i++;
	}
	
	int n=i;                                                                
	
	for(i=0;i<n;i++){
	  average=average+b[i];
	  }
	average=average/n;
	
	int maximum=b[0];
	for(i=1;i<n;i++){
	  if(b[i]>maximum)
	    maximum=b[i];
	}
	
	
	
	int minimum=b[0];
	for(i=1;i<n;i++){
	  if(b[i]<minimum)
	    minimum=b[i];
	}
	
	
	
	for(i=0;i<n;i++){
	sd=sd+(b[i]-average)*(b[i]-average);
	}
	sd=sd/n;
	sd=Math.sqrt(sd);
	
	
	System.out.print("Numbers:");
	for(i=0;i<n;i++){
			System.out.print(","+b[i]);
	}
	System.out.println("\n");
	System.out.println("The average is:"+String.format("%.2f",average));
	System.out.println("The minimum is:"+minimum);
	System.out.println("The maximum is:"+maximum);
	System.out.println("The standard deviation is:"+String.format("%.2f",sd));
	
}
}
	
	
	
	
	
	
	

	
	
	  
	
	
	
	
	
	
	
	