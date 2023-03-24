import java.util.Scanner;

class Polygon{
int length,width,side;
float base,height,radius;
        void area(int l,int w){
                length=l;
                width=w;
                System.out.println("Area of rect: "+l*w);
        }
        void area(float r)
        {
                radius=r;
                System.out.println("Area of Circle: "+3.14*r*r);
        }
        void area(int s)
        {
                side=s;
                System.out.println("Area of Sq: "+s*s);
        }
        void area(float ba,float h)
        {
                base=ba;
                height=h;
                System.out.println("Area of Tri: "+0.5*ba*h);
        }
}
public class Area
{
        public static void main(String args[])
	{
                Scanner input = new Scanner(System.in);
                        System.out.println("Enter length: ");
                        int length=input.nextInt();
                        System.out.println("Enter width: ");
                        int width=input.nextInt();
                        System.out.println("Enter radius: ");
                        float radius=input.nextFloat();
                        System.out.println("Enter side of square: ");
                        int side=input.nextInt();
                        System.out.println("Enter base: ");
                        float base=input.nextFloat();
                        System.out.println("Enter height: ");
                        float height=input.nextFloat();
                        Polygon a=new Polygon();
                        a.area(length,width);
                        a.area(radius);
                        a.area(side);
                        a.area(base,height);
        }
}