class Sum{
    public static void main(String[] args) {
     int num = 7890;
     int digit;
     int sum =0;
     while(num>0)
     {
        digit=num%10;
        sum=digit+sum;
        num=num/10;
     }
     System.out.println(sum);
    }
}