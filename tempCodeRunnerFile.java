import java.util.*;
class TataTransports
{
    int wheels;
    int seats;
    int maxWeight;
    String color;
    void displayDescription()
    {
        System.out.println("No. of wheels are: "+wheels);
        System.out.println("No. of seats are: "+seats);
        System.out.println("Maximum Weight is: "+maxWeight+ "Kg");
        System.out.println("Color is: "+color);
        System.out.println("");
    }
}
class Twowheeler extends TataTransports
{
    Twowheeler(int a,int b,int c,String d)
    {
        System.out.println("This is a Two-wheeler");
        wheels = a;
        seats = b;
        maxWeight = c;
        color = d ;

               this.displayDescription();
    }
}
class Sedan extends TataTransports
{
    Sedan(int a,int b,int c,String d)
    {
        System.out.println("This is a Sedan");
        wheels = a;
        seats = b;
        maxWeight = c;
        color = d ;
             
               this.displayDescription();
    }
}
class LargeTruck extends TataTransports
{
    LargeTruck(int a,int b,int c,String d)
    {
        System.out.println("This is a Large Truck");
        wheels = a;
        seats = b;
        maxWeight = c;
        color = d ;
            
               this.displayDescription();
    }
}
class Main{
    public static void main(String args[])
    {
        TataTransports obj = new Twowheeler(2,1,70,"Red");
        TataTransports obj1 = new LargeTruck(4,10,500,"Brown");
    }
}