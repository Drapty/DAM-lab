public class Ford extends Car
{
     Ford(int year,String color,int speed,double regularPrice,int manufacturerDiscount)
    {
this.year=year;
super.color=color;
super.speed=speed;
super.regularPrice=regularPrice;
this.manufacturerDiscount=manufacturerDiscount;

    }

int year;
double manufacturerDiscount=super.getSalePrice();
double getSalePrice()
{


    return manufacturerDiscount;
};

}
