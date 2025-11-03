public  class Midtask {
    
    public static void main (String [] args ) {

        //a system stores customers first and last name separately combined them into a single formatted fullname 
    
         String firstname = " Chandramowlee Chy" ;
         String lastname = "Zizu" ;
         
         String fullname = firstname  + " " + lastname ;
         System.out.println("firstname : "+ firstname);


        // Generate a product code by joing the product name and id 


        String productname = " Naga Drums " ;
        String productid = "25363877465" ; 
        String productCode = productname + " " + productid ;
        System.out.println(productCode ) ;


        // Extract the username (before @) from an email address

        String email = "chandramowleechyzizu@gmail.com";
        String substring = email.substring(0);
        System.out.println ("Username : " +substring );


    }
}
