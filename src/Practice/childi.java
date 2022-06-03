package Practice;

public class childi extends Parenti
{
	public void bike()
	{
		System.out.println("car from cc class");
	}
	public void  hat()
	{
		System.out.println("hat from cc class");
	}
public static void main(String[] args)
{
	childi c=new childi();
	c.farm();
	c.car();
	c.bunglow();
	c.money();
	c.hat();
	c.bike();
	Parenti.mathod();

}
}
