import java.util.Scanner;
class array{
    public static void main(String args[])
    {
        int arr[]=new int[5];
        System.out.println("Enter 5 elements: ");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("-------------");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Array after sorting: ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }
        System.out.println("");
        System.out.println("Sum: "+sum);
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Enter elem to search: ");
        int element=input.nextInt();
        int index=-1;
        for(int i=0;i<5;i++){
            if (arr[i]==element){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index: "+index);
        }
    }
}