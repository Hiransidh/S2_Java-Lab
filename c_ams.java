import java.util.Scanner;
class c_ams
{
  int number,rem, result;
void display()
{
  result=0;  
  Scanner in=new Scanner(System.in);
  System.out.println("Enter num:");
  int num=in.nextInt();
  number=num;
  while(number!= 0) 
{   
   rem = number % 10;             
   result =result+(rem * rem * rem);
   number=number/ 10;
  }
 if(result==num)
 System.out.println("Armstrong number");
 else
 System.out.println("not an Armstrong number");

 }
}
class Main
{
 public static void main(String args[])
 {
    c_ams a=new c_ams();
     a.display();
 }
}

