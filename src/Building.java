/*Polymorphism
 Name: Thabet Taleb
 Course:Object-Oriented Programming
 Date:11/03/21
   */

//Building Class
class Building implements CarbonFootprint
{
   int noStoreys;
   float fuelUsed;
  
   Building(int n, float f)
   {
       noStoreys = n;
       fuelUsed = f;
   }
  
   public void getCarbonFootprint()
   {
       float cf = noStoreys*fuelUsed;
       System.out.println("Building Carbon Foot Print : " + cf);
   }

}