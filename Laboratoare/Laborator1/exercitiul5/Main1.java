
public class Main1
{
public static void main(String args[])
{
   Sedan sedan=new Sedan(300,"Red",200,8000);

   Ford ford1=new Ford(30,"Black",150,8000,2008);

    Ford ford2=new Ford(350,"Blue",300,14000,2015);

    Car obj=new Car();

    obj.color="Green";
    obj.speed=127;
    obj.regularPrice=5999;

    double pricesale=sedan.getSalePrice();
    System.out.println(pricesale);

    System.out.println(ford1.getSalePrice());

    System.out.println(ford2.getSalePrice());

    System.out.println(obj.getSalePrice());




}

}
