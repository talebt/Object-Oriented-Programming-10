/*Polymorphism
 Name: Thabet Taleb
 Course:Object-Oriented Programming
 Date:11/03/21
   */




//Driver Class
import java.util.*;

public class drivercf
{
   public static void main(String args[])
   {
       ArrayList<CarbonFootprint> cf = new ArrayList<CarbonFootprint>();;
       Building b = new Building(5,5.125f);
       Car c = new Car(500,2.78f);
       biCycle bc = new biCycle();
       cf.add(b);
       cf.add(c);
       cf.add(bc);
      
       Iterator<CarbonFootprint> itr = cf.iterator();
       while(itr.hasNext()){
           itr.next().getCarbonFootprint();
       }
   }
}