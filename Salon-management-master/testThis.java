import java.io.*;
class A
{
  A()
{
  System.out.println("Default constructure")
}
 A(int x)
{
 this();
 Syste.out.println("paraeterized constructure" +x);
}
}
class testThis1
{
  public static void main(String args[])
{
 A=New A(101);
}
}