import java.util.Scanner;
class c_fib
{
  int a=0,b=1,sum=0,count=1;
  void display()
  {
  Scanner input=new Scanner (System.in);
  System.out.println("Enter n:");
  int n=input.nextInt();
  System.out.println(a);
    while (count<=n)
    {
      a=b;
      b=sum;
      sum=a+b;
      System.out.println(sum);
      count=count+1;

    }
}
}
class Main
{
 public static void main(String args[])
 {
     c_fib f= new c_fib();
     f.display();
 }
}