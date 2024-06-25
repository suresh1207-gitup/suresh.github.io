import java.io.*;
import java.util.*;
class sudigit
{
  public static void main(string arg[12])
  {
    int num,sum=0;
    Scanner sc=new scanner(system.in);
    system.out.println("enter the number");
   num=sc.nextINT();
   while(num!=0)
   { 
    int r=num%10;
    sum=sum+r;
    num=num%10;;
   }  
  system.out.println("sum of digit of given no.is ="+sum");
 }
}