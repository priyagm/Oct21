package com.aspire.java.InheritenceMultilevel;

public class Testclass
{
	public static void main(String[] args)
	{
	Parent p =new Parent();
	p.car();
	p.bunglow();
	DualBehavoiur db=new DualBehavoiur();
	db.car();
	db.bunglow();
	db.gold();
	Child c=new Child();
	c.car();
	c.bunglow();
	c.gold();
	c.bike();
	c.iphone();
	}

}
