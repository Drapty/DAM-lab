public class Sedan extends Car
{
    Sedan(int length,String color,int speed,double regularPrice)
    {
this.length=length;
super.color=color;
super.speed=speed;
super.regularPrice=regularPrice;

    }

int length;
double getSalePrice()
{
    if (length>6.096)
    {
double discount=regularPrice*5/100;
double discountprice=regularPrice-discount;
return discountprice;
    }
    else 
    {
double discount=regularPrice*10/100;
double discountprice=regularPrice-discount;
return discountprice;
    }
}
}

   

