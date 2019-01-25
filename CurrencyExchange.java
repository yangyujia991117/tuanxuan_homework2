import java.util.Scanner;

public class CurrencyExchange{
  public static void main(String[] args){
	
    Scanner scan=new Scanner(System.in);                    
    System.out.println("How many eruos are you exchanging?");
	double A=scan.nextInt();
	System.out.println("What is the exchange rate?");
	double B=scan.nextDouble();
	double C=A/100.0*B;
	System.out.println(String.format("%.2f", A)+"euros at an exchange rate of"+ String.format("%.2f", B)+" is "+String.format("%.2f", C)+" U.S. dollars");
	}
}