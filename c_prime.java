import java.util.Scanner;
public class c_prime {
    void display()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int l = input.nextInt();
        for(int num=2;num<=l;num++)
        {
            int n=0;
            for(int i=2;i<=num/2;i++)
            {
                if((num%i)==0)
                {
                    n++;
                    break;
                }
            }
            if(n==0)
            System.out.println(num);
        }
    }
}
class Main
{
 public static void main(String args[])
 {
     c_prime p=new c_prime();
     p.display();
 }
}
