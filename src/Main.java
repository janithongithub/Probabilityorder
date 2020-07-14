import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Double p1_20Double = Math.random()*100.0;
        int p1_20Int = p1_20Double.intValue();
        System.out.println(p1_20Int);


     if(20 > p1_20Int && p1_20Int > 0){



         Double r = (Math.random())*100.0;
         int p = r.intValue();
         System.out.println(p);


         //Random number between 1 and 100 (inclusive)
         if(p==0){
             System.out.println("1 item");
         }
         else if(p <= 50) //50% chance
         {
             System.out.println("2 items");
         }
         else if(p <= 75) //25% chance
         {
             System.out.println("3 items");
         }
         else if(p <= 88) //13% chance
         {
             System.out.println("4 items");
         }
         else if(p <= 94) //6% chance
         {
             System.out.println("5 items");
         }
         else //other 6% chance
         {
             System.out.println("1 item");
         }

     }
     else {
         System.out.println("No order generated");
     }
      ////////





    }
}
