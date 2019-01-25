import java.util.Scanner;

public class HeartRate{
  public static void main(String[] args){
  
    Scanner scan=new Scanner(System.in);
	
	System.out.println("RestingHR:");
	double RestingHR=scan.nextDouble();
	System.out.println("age");
	int Age=scan.nextInt();
	
	System.out.println("---------|---------------");
	
    for(double Intensity=0.55;Intensity<=1.00;Intensity=(Intensity+0.05)){
	double TargetHeartRate =(((220 - Age) - RestingHR) * Intensity) + RestingHR;
	double a=Intensity*100;
	System.out.println(Math.round(a)+"%|"+Math.round(TargetHeartRate)+"bmp");
	}
    }
}
	
	
	
	