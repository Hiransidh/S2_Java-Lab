import java.util.Scanner;
class ComplexNum{
    int r,i;
    ComplexNum(){
    }
    ComplexNum(int r,int i){
        this.r=r;
        this.i=i;
    }
    void Display(){
        System.out.println(this.r+"+"+this.i+"i");
    }
    ComplexNum Add(ComplexNum c1,ComplexNum c2){
         ComplexNum temp=new ComplexNum();
         temp.r=c1.r+c2.r;
         temp.i=c1.i+c2.i;
         return temp;
    }
}
class main
        {
         public static void main(String args[])
        {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of first complex number: ");
        int r1 =scanner.nextInt();
        int i1=scanner.nextInt();
        ComplexNum c1=new ComplexNum(r1,i1);
        System.out.println("Enter the real and imaginary part of second complex number: ");
        int r2 =scanner.nextInt();
        int i2=scanner.nextInt();
        ComplexNum c2=new ComplexNum(r2, i2);
        System.out.println("first complex number:");
        c1.Display();
        System.out.println("second complex number:");
        c2.Display();
        ComplexNum c3=new ComplexNum();
        c3=c3.Add(c1, c2);
        System.out.println("sum:"+c3.r+"+"+c3.i+"i");
    }
}
