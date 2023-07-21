
import java.util.Scanner;
class Product{
int pcode,price;
String pname;
void Read(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the product code:");
pcode=sc.nextInt();
System.out.println("Enter the product name:");
pname=sc.next();
System.out.println("Enter the product price:");
price=sc.nextInt();
}
}
class Main1{
public static void main(String args[]){
Product a=new Product();
Product b=new Product();
Product c=new Product();
System.out.println("product 1:");
a.Read();
System.out.println("product 2:");
b.Read();
System.out.println("product 3:");
c.Read();
if((a.price<b.price) &&(a.price<c.price)){
System.out.println("product with pcode:"+a.pcode+",product name:"+a.pname+" has the lowest price:"+a.price);
}
else if((b.price<a.price)&&(b.price<c.price))
System.out.println("product with pcode:"+b.pcode+",product name:"+b.pname+" has the lowest price:"+b.price);
else
System.out.println("product with pcode:"+c.pcode+",product name:"+c.pname+" has the lowest price:"+c.price);
}
}
