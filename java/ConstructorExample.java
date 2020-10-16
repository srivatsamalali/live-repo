public class ConstructorExample{
   public static void main(String args[]){
      //create the reference
      Mobile samsungMobile;
      //create an instance and assign it to the reference
      samsungMobile = new Mobile();
   }
}

class Mobile{
   String name;
   float price;

   //Constructors are functions without a return type
   //same name of the class
   // purpose is to initialize variables
   public Mobile(){
      System.out.println("Default Constructor");
      name = "Samsung";
      price = 30.50f;
   }
}