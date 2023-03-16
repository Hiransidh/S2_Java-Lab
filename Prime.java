class Prime
{
    public static void main(String[] args) {
        int i,j,x,m;
        System.out.println("2"+" ");
        System.out.println("3"+" ");
        for(i=4;i<=100;i++)
        {
            x=0;
            for(j=2;j<=i-1;j++)
            {
                m=i%j;
                if(m==0)
                {
                    x=1;
                    break;
                }
            }
        if(x==0)
        {
            System.out.println(i+" ");
            
        }
        }
        }
}