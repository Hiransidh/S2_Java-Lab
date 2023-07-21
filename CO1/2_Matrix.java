import java.util.Scanner;
class Matrix {
    int m,n;
    int arr1[][]=new int[10][10];
    int arr2[][]=new int[10][10];
    int arr3[][]=new int[20][20];
    Scanner sc=new Scanner(System.in);
    
    void Read(){
        System.out.println("Enter row size:");
        m=sc.nextInt();
        System.out.println("Enter column size:");
        n=sc.nextInt();

        System.out.println("Enter "+m*n+" elements of first matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter "+m*n+" elements of second matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
    }
    
    void Display(){
        System.out.println("Matrix 1 is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
    
        }
        System.out.println("Matrix 2 is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
    void Add(){
        System.out.println("Matrix1 + Matrix2 is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
  
}

class matrix1{
    public static void main(String args[]){
        Matrix a=new Matrix();
        a.Read();
        a.Display();
        a.Add();
           
    }
}
