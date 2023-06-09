import java.util.Scanner;
class search{
    int arr1[]=new int[3];
    String arr2[]=new String[3];
    Scanner sc=new Scanner(System.in);
    search(){
        System.out.println("Enter 3 numbers:");
        for(int i=0;i<3;i++){
            int a=sc.nextInt();
            arr1[i]=a;
        }
        System.out.println("Enter 3 Strings:");
        for(int i=0;i<3;i++){
            String a=sc.next();
            arr2[i]=a;
        }
    }
    void searchforinteger(){
        int temp=0;
        System.out.println("Enter the number you want to search:");
        int s=sc.nextInt();
        for(int i=0;i<3;i++){
            if(arr1[i]==s){
                temp=1;
                break;
            }
        }
        if(temp==1){
            System.out.println("Number found");
        }
        else{
            System.out.println("Number not found");
        }
    }
    void searchforstring(){
        int temp=0;
        System.out.println("Enter the string you want to search:");
        String s=sc.next();
        for(int i=0;i<3;i++){
            if(arr2[i].equals(s)){
                temp=1;
                break;
            }
           }
        if(temp==1){
            System.out.println("String found");
        }
        else{
            System.out.println("String not found");
        }

    }
}
class main
        {
         public static void main(String args[])
                {
                search a= new search();
                Scanner sc=new Scanner(System.in);
                while(true)
                        {
                         System.out.println("1.search for Integer.");
                         System.out.println("2.search for String.");
                         System.out.println("3.Exit.");
                         System.out.println("Enter your choice:");
                        int choice=sc.nextInt();
                        if(choice==1)
                                {
                                        a.searchforinteger();
                                }
                        else if(choice==2)
                        {
                        a.searchforstring();
                        }
                else if(choice==3)
                        {
                        System.out.println("Exit successfull");
                        System.exit(0);
                        }
                else
                        {
                         System.out.println("Invalid Choice");
                        }
                }
         }
