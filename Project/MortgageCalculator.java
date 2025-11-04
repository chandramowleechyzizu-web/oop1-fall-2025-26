package Project;

import java.util.Scanner; 

public  class MortgageCalculator {
    public static void main (String [ ]args ) {
   System.out.println  ( "MortgageCalculator" );


   Scanner scanner = new Scanner (System.in) ;


   System.out.println( "Enter loan amount (Principal P ) :  " ) ;
   double principal = input.nextdoublen();

   System.out.println ( "Enter annual interest rate in ( in % ) : ");
   double annualRate = input.nextdouble();

   System.out.print ( "Enter the loan term in years : " );
     int years = input.nextInt();
     double r = annualRate / 100/ 12 ;

      int n =  years * 12 ;


      double numerator = r * Math.pow( 1+r , n );
      double denominator = Math .pow (1+r,n)- 1 ;
        double monthlyPayment = principal * (numerator/denominator );

        System.out.prinln ( "Your monthly payment is : $" + String.format("%.2f", monyhlyPayment));

        input.close();

    }
}
