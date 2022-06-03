package Practice;

public class testoverloading 
{
public static void main(String[] args)
{
	parentoverloading pl=new parentoverloading();
	pl.car();
	pl.bunglow();
	pl.farm();
	pl.money();
	pl.sub();
	childoverloading cl=new childoverloading();
	cl.car();
	cl.farm();
	cl.bike();
	cl.bunglow();
	cl.money();
	
}
}
