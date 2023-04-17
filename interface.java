interface Area
        {
        void get();
        void display();
        }
class Rectangle implements Area
        {
        int l,b;
        public void get()
                {
                l=10;
                b=5;
                }
        public void display()
                {
                System.out.println("Area of rectangle: "+l*b);
                }
        }
class Circle implements Area
        {
        int r;
        public void get()
                {
                r=2;
                }
        public void display()
                {
                System.out.println("Area of Circle: "+3.14*r*r);
                }
        }
class Square implements Area
        {
        int a;
        public void get()
                {
                a=4;
                }
        public void display()
                {
                System.out.println("Area of Square: "+a*a);
                }
        }
class Main
        {
        public static void main(String args[])
                {
                Rectangle r= new Rectangle();
                r.get();
                r.display();
                Circle c= new Circle();
                c.get();
                c.display();
                Square s=new Square();
                s.get();
                s.display();
                }
        }
