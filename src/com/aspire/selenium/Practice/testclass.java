package com.aspire.selenium.Practice;

public class testclass
{
public static void main(String[] args) 
{
Child	c= new Child();
c.bike();// child
c.bunglow();// parent
c.car();// parent
Parent p =new Parent();
p.bunglow();
p.car();

}
}
