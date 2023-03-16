import java.util.Scanner;
public class num_pattern{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter limit: ");
        int rows= input.nextInt();
        System.out.println("-----------------------");
        for (int i=1;i<=rows;i++)
        {
            int num=0;
            for (int j=1;j<=i;j++){
                System.out.print(num + " ");
                num += i;
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
}

