/*Polymorphism
 Name: Thabet Taleb
 Course:Object-Oriented Programming
 Date:11/03/21
   */



//Car class
class Car implements CarbonFootprint
{
   int km;
   float fuelUsed;
  
   Car(int k, float f)
   {
       km = k;
       fuelUsed = f;
   }
  
   public void getCarbonFootprint()
   {
       float cf = km*fuelUsed;
       System.out.println("Car Carbon Foot Print : " + cf);
   }

}

//BiCyCle class
class biCycle implements CarbonFootprint
{
  
   public void getCarbonFootprint()
   {
       System.out.println("biCycle Carbon Foot Print : 0");
   }

}

