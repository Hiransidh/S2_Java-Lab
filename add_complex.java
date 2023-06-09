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
        ComplexNum c1=new ComplexNum(8, 04);
        ComplexNum c2=new ComplexNum(2, 06);
        System.out.println("first complex number:");
        c1.Display();
        System.out.println("second complex number:");
        c2.Display();
        ComplexNum c3=new ComplexNum();
        c3=c3.Add(c1, c2);
        System.out.println("sum:"+c3.r+"+"+c3.i+"i");
    }
}
